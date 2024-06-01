package dev.fredyhg.cleanarchitecture.domain.shared.event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventDispatcherImpl implements EventDispatcher {
    private Map<String, List<EventHandler>> eventHandlers = new HashMap<>();

    public Map<String, List<EventHandler>> getEventHandlers() {
        return eventHandlers;
    }

    @Override
    public void register(String eventName, EventHandler eventHandler) {
        eventHandlers.computeIfAbsent(eventName, k -> new ArrayList<>()).add(eventHandler);
    }

    @Override
    public void unregister(String eventName, EventHandler eventHandler) {
        List<EventHandler> handlers = eventHandlers.get(eventName);
        if (handlers != null) {
            handlers.remove(eventHandler);
            if (handlers.isEmpty()) {
                eventHandlers.remove(eventName);
            }
        }
    }

    @Override
    public void unregisterAll() {
        eventHandlers.clear();
    }

    @Override
    public void notify(Event event) {
        String eventName = event.getClass().getName();
        List<EventHandler> handlers = eventHandlers.get(eventName);
        if (handlers != null) {
            for (EventHandler handler : handlers) {
                handler.handle(event);
            }
        }
    }
}