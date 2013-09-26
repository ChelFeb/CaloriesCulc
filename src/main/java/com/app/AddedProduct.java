package com.app;

import java.util.Date;

public class AddedProduct {

    private int mass;
    private Date date;
    private Product product;

    public AddedProduct(int mass, Product product) {
        this.mass = mass;
        this.date = new Date();     // дата добавления продукта
        this.product = product;
    }

  //-------------------------------------------------------
    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


}
