package com.shop.cartorderservice.dto;

import java.util.Arrays;

public class CartDto {
    private String id;
    private String userId;
    private ProductQty[] products;

    public CartDto(String id, String userId, ProductQty[] products) {
        this.id = id;
        this.userId = userId;
        this.products = products;
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

    @Override
    public String toString() {
        return "{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"userId\":\"" + userId + "\""
                + ",                         \"products\":" + Arrays.toString(products)
                + "}";
    }
}
