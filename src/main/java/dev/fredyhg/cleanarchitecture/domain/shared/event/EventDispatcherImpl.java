package dev.fredyhg.cleanarchitecture.domain.shared.event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventDispatcherImpl implements EventDispatcher {
    private Map<String, List<EventHandler>> eventHandlers = new HashMap<>();

    public Map<String, List<EventHandler>> getEventHandlers() {
        return this.eventHandlers;
    }

    public void register(String eventName, EventHandler eventHandler) {
        this.eventHandlers.putIfAbsent(eventName, new ArrayList<>());
        this.eventHandlers.get(eventName).add(eventHandler);
    }

    public void unregister(String eventName, EventHandler eventHandler) {
        List<EventHandler> handlers = this.eventHandlers.get(eventName);
        if (handlers != null) {
            handlers.remove(eventHandler);
            if (handlers.isEmpty()) {
                this.eventHandlers.remove(eventName);
            }
        }
    }

    public void unregisterAll() {
        this.eventHandlers.clear();
    }

    public void notify(Event event) {
        String eventName = event.getClass().getSimpleName();
        List<EventHandler> handlers = this.eventHandlers.get(eventName);
        if (handlers != null) {
            for (EventHandler handler : handlers) {
                handler.handle(event);
            }
        }
    }
}