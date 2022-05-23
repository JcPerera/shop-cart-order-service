package com.shop.cartorderservice.dto;

import java.util.Arrays;
import java.util.Date;

public class OrderDto {
    private String id;
    private String userId;
    private ProductQty[] products;
    private double amount;
    private Address address;
    private String status;

    public OrderDto(String id, String userId, ProductQty[] products, double amount, Address address, String status) {
        this.id = id;
        this.userId = userId;
        this.products = products;
        this.amount = amount;
        this.address = address;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ProductQty[] getProducts() {
        return products;
    }

    public void setProducts(ProductQty[] products) {
        this.products = products;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"userId\":\"" + userId + "\""
                + ",                         \"products\":" + Arrays.toString(products)
                + ",                         \"amount\":\"" + amount + "\""
                + ",                         \"address\":" + address
                + ",                         \"status\":\"" + status + "\""
                + "}";
    }
}
