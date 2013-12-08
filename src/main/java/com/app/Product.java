package com.app;

import com.hibernate.entity.HibernateEntity;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Product extends HibernateEntity{

    private String productName;
    private double kiloCalories;
    private double protein;
    private double fat;
    private double carbohydrate;
    private int productOwnerId;
    Set<AddedProduct> addedProductSet;


    public Product() {
        super();
    }

    public Product(String productName,
                   double kiloCalories, double protein, double fat, double carbohydrate, int productOwnerId) {
        this();
        this.productName = productName;
        this.kiloCalories = kiloCalories;
        this.protein = protein;
        this.fat = fat;
        this.carbohydrate = carbohydrate;
        this.productOwnerId = productOwnerId;
    }

    public int getProductOwnerId() {
        return productOwnerId;
    }

    public void setProductOwnerId(int productOwnerId) {
        this.productOwnerId = productOwnerId;
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

  @OneToMany(fetch = FetchType.EAGER, mappedBy = "product")
    public Set<AddedProduct> getAddedProductSet() {
        return addedProductSet;
    }

    public void setAddedProductSet(Set<AddedProduct> addedProductSet) {
        this.addedProductSet = addedProductSet;
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
