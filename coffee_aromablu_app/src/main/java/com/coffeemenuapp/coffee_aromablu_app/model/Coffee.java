package com.coffeemenuapp.coffee_aromablu_app.model;

public class Coffee {
    private String name;
    private double price;
    private String nutritionalFacts;
    private String origin;
    private String combo;

    public Coffee(String name, double price, String nutritionalFacts, String origin, String combo) {
        this.name = name;
        this.price = price;
        this.nutritionalFacts = nutritionalFacts;
        this.origin = origin;
        this.combo = combo;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getNutritionalFacts() {
        return nutritionalFacts;
    }

    public String getOrigin() {
        return origin;
    }

    public String getCombo() {
        return combo;
    }
}
