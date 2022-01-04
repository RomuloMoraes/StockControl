package com.stock.control.model;

public class Product {

    private String productName;
    private int productId;
    public double productPrice;

    public Product() {

    }

    public Product(String productName, int productId, double productPrice) {
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public Double setProductPrice(double productPrice) {
        return this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product name: " + productName + " - ID: " + productId + " - Price: " + productPrice;
    }
}
