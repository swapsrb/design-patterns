package com.design.models;

public class Address
{
    private String addressLine;
    private String state;
    private String city;
    private String pinCode;
    private String country;

    public Address(String addressLine, String state, String city, String pinCode, String country) {
        this.addressLine = addressLine;
        this.state = state;
        this.city = city;
        this.pinCode = pinCode;
        this.country = country;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getPinCode() {
        return pinCode;
    }

    public String getCountry() {
        return country;
    }
}
