package com.app;

import com.hibernate.entity.HibernateEntity;

public class Product extends HibernateEntity{

    private String productName;
    private double kiloCalories;
    private double protein;
    private double fat;
    private double carbohydrate;

    public Product() {
        super();
    }

    public Product(String productName,
                   double kiloCalories, double protein, double fat, double carbohydrate) {
        this();
        this.productName = productName;
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

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", kiloCalories=" + kiloCalories +
                ", protein=" + protein +
                ", fat=" + fat +
                ", carbohydrate=" + carbohydrate +
                '}';
    }


}
