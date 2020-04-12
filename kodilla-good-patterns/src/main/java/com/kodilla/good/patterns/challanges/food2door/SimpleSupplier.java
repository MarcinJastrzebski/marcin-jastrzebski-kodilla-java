package com.kodilla.good.patterns.challanges.food2door;

public class SimpleSupplier implements Supplier {

    private String firstName;
    private String surname;
    private String email;
    private String address;
    private String brandName;

    public SimpleSupplier(final String firstName, final String surname, final String email, final String address, final String brandName) {
        this.firstName = firstName;
        this.surname = surname;
        this.email = email;
        this.address = address;
        this.brandName = brandName;
    }

    @Override
    public String getBrandName() {
        return brandName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "SimpleSupplier{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}
