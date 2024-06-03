package dev.fredyhg.cleanarchitecture.domain.customer.validator;

import dev.fredyhg.cleanarchitecture.domain.customer.entity.Customer;
import dev.fredyhg.cleanarchitecture.domain.shared.notification.NotificationError;
import dev.fredyhg.cleanarchitecture.domain.shared.validator.ValidatorInterface;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

import javax.management.Notification;
import java.util.Set;

public class CustomerYupValidator implements ValidatorInterface<Customer> {

    private final Validator validator;

    public CustomerYupValidator() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        this.validator = factory.getValidator();
    }

    @Override
    public void validate(Customer entity) {
        Set<ConstraintViolation<Customer>> violations = validator.validate(entity);

        for (ConstraintViolation<Customer> violation : violations) {
            entity.notification.addError(new NotificationError(
                    "customer",
                    violation.getMessage()
            ));
        }
    }
}