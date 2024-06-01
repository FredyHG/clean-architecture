package dev.fredyhg.cleanarchitecture.domain.shared.event;

public interface EventDispatcherInterface {
    void notify(Event event);
    void register(String eventName, Object eventHandler);
}
