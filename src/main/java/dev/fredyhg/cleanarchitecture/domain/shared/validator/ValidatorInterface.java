package dev.fredyhg.cleanarchitecture.domain.shared.validator;

public interface ValidatorInterface<T> {
    void validate(T entity);
}
