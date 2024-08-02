package com.example.demo;

public class ProductManufacturer {

    private Integer productId;
    private String productName;
    private Float productPrice;
    private Integer manufacturerId;
    private String manufacturerName;
    private String manufacturerCountry;

    ProductManufacturer(){

    }

    public ProductManufacturer(Integer productId, String productName, Float productPrice, Integer manufacturerId, String manufacturerName, String manufacturerCountry) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.manufacturerId = manufacturerId;
        this.manufacturerName = manufacturerName;
        this.manufacturerCountry = manufacturerCountry;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Float productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    @Override
    public String toString() {
        return "ProductManufacturer{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", manufacturerId=" + manufacturerId +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", manufacturerCountry='" + manufacturerCountry + '\'' +
                '}';
    }
}
