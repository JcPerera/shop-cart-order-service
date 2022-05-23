package com.shop.cartorderservice.dto;

public class ProductQty {
    private String productId;
    private int quantity;

    public ProductQty(String productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "{"
                + "                        \"productId\":\"" + productId + "\""
                + ",                         \"quantity\":\"" + quantity + "\""
                + "}";
    }
}
