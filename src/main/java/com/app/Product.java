package com.app;

public class Product {
    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", mass=" + mass +
                ", kiloCalories=" + kiloCalories +
                ", protein=" + protein +
                ", fat=" + fat +
                ", carbohydrate=" + carbohydrate +
                '}';
    }

    private String productName;
    private int mass;
    private double kiloCalories;
    private double protein;
    private double fat;
    private double carbohydrate;

    public Product(String productName, int mass,
                   double kiloCalories, double protein, double fat, double carbohydrate) {
        this.productName = productName;
        this.mass = mass;
        this.kiloCalories = kiloCalories;
        this.protein = protein;
        this.fat = fat;
        this.carbohydrate = carbohydrate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public double getKiloCalories() {
        return kiloCalories;
    }

    public void setKiloCalories(double kiloCalories) {
        this.kiloCalories = kiloCalories;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(double carbohydrate) {
        this.carbohydrate = carbohydrate;
    }
}
