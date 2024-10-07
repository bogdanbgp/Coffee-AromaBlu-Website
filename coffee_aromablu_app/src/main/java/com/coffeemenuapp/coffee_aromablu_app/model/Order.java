package com.coffeemenuapp.coffee_aromablu_app.model;

public class Order {
    private String customerName;
    private String itemName;
    private double price;
    private String message;

    public Order(String customerName, String itemName, double price, String message) {
        this.customerName = customerName;
        this.itemName = itemName;
        this.price = price;
        this.message = message;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
