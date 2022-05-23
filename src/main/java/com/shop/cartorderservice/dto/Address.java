package com.shop.cartorderservice.dto;

import org.springframework.util.Assert;

public class Address {
    private String street;
    private String suburb;
    private String postCode;
    private String country;

    public Address(String street, String suburb, String postCode, String country) {
        Assert.hasText(street, "Street must not be null or empty!");
        Assert.hasText(suburb, "Suburb must not be null or empty!");
        Assert.hasText(postCode, "Post Code must not be null or empty!");
        Assert.hasText(country, "Country must not be null or empty!");
        this.street = street;
        this.suburb = suburb;
        this.postCode = postCode;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "{"
                + "                        \"street\":\"" + street + "\""
                + ",                         \"suburb\":\"" + suburb + "\""
                + ",                         \"postCode\":\"" + postCode + "\""
                + ",                         \"country\":\"" + country + "\""
                + "}";
    }
}
