package dev.fredyhg.cleanarchitecture.domain.customer.factory;

import dev.fredyhg.cleanarchitecture.domain.customer.entity.Customer;
import dev.fredyhg.cleanarchitecture.domain.customer.validator.CustomerYupValidator;
import dev.fredyhg.cleanarchitecture.domain.shared.validator.ValidatorInterface;

public class CustomerValidatorFactory {
    public static ValidatorInterface<Customer> create() {
        return new CustomerYupValidator();
    }
}
