package com.shop.cartorderservice.model;

import com.shop.cartorderservice.dto.ProductQty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;
import java.util.Date;

@Document("carts")
public class Cart {

    @Id
    private String id;
    private String userId;
    private ProductQty[] products;
    private Date createdAt;
    private Date updatedAt;

    public Cart(String id, String userId, ProductQty[] products, Date createdAt, Date updatedAt) {
        this.id = id;
        this.userId = userId;
        this.products = products;
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
                + ",                         \"createdAt\":" + createdAt
                + ",                         \"updatedAt\":" + updatedAt
                + "}";
    }
}
