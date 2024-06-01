package dev.fredyhg.cleanarchitecture.domain.shared.event;

public interface EventDispatcher {
    void notify(Event event);
    void register(String eventName, EventHandler eventHandler);
    void unregister(String eventName, EventHandler eventHandler);
    void unregisterAll();
}
