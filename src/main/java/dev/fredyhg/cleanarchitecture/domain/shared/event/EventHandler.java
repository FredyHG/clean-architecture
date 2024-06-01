package dev.fredyhg.cleanarchitecture.domain.shared.event;

public interface EventHandler<T extends Event> {
    void handle(T event);
}
