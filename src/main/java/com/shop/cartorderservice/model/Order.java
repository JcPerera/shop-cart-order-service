package com.shop.cartorderservice.model;

import com.shop.cartorderservice.dto.Address;
import com.shop.cartorderservice.dto.ProductQty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.Date;

@Document("orders")
public class Order {

    @Id
    private String id;
    private String userId;
    private ProductQty[] products;
    private double amount;
    private Address address;
    private String status;
    private Date createdAt;
    private Date updatedAt;


    public Order(String id, String userId, ProductQty[] products, double amount, Address address, String status, Date createdAt, Date updatedAt) {
        Assert.hasText(userId, "User Id must not be null or empty!");
        Assert.notNull(address, "Address must not be null or empty!");
        Assert.hasText(status, "Status must not be null or empty!");
        this.id = id;
        this.userId = userId;
        this.products = products;
        this.amount = amount;
        this.address = address;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
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
                + ",                         \"createdAt\":" + createdAt
                + ",                         \"updatedAt\":" + updatedAt
                + "}";
    }
}
