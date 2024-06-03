package dev.fredyhg.cleanarchitecture.domain.customer.entity;

import dev.fredyhg.cleanarchitecture.domain.customer.factory.CustomerValidatorFactory;
import dev.fredyhg.cleanarchitecture.domain.customer.valueobject.Address;
import dev.fredyhg.cleanarchitecture.domain.shared.entity.Entity;
import lombok.Data;

@Data
public class Customer extends Entity {
    private String name;
    private Address address;
    private Boolean active;
    private Float rewardPoints = 0F;

    public Customer(String name, String id) {
        super();
        this.id = id;
        this.name = name;
        this.validate();
        if (this.notification.hasErrors()) {
            throw new RuntimeException(this.notification.getErrors().toString());
        }
    }

    public void addRewardPoints(Float rewardPoints) {
        this.rewardPoints += rewardPoints;
    }

    public void validate() {
        CustomerValidatorFactory.create().validate(this);
    }

    public void changeName(String name) {
        this.name = name;
        this.validate();
    }

    public void changeAddress(Address address) {
        this.address = address;
    }

    public void deactivate() {
        this.active = false;
    }
}
