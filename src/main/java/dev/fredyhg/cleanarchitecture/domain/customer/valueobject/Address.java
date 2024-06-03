package dev.fredyhg.cleanarchitecture.domain.customer.valueobject;

import lombok.Data;

@Data
public class Address {

    private String street;
    private Integer number;
    private String city;
    private String zip;

    public Address(Integer number, String street, String zip, String city) {
        this.number = number;
        this.street = street;
        this.zip = zip;
        this.city = city;

        this.validate();
    }

    public void validate() {
        if (this.street.isEmpty() || this.street.isBlank()) {
            throw new RuntimeException("Street is required");
        }
        if (this.number.equals(0)) {
            throw new RuntimeException("Number is required");
        }
        if (this.zip.isEmpty() || this.zip.isBlank()) {
            throw new RuntimeException("Zip is required");
        }
        if (this.city.isEmpty() || this.city.isBlank()) {
            throw new RuntimeException("City is required");
        }
    }
}
