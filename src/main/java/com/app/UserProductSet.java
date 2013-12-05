package com.app;

import java.util.ArrayList;

public class UserProductSet {

    ArrayList<AddedProduct> list;

    public UserProductSet(ArrayList<AddedProduct> list) {
        this.list = list;
    }

    public void addProduct(int mass, Product product, int userId) {
        list.add(new AddedProduct(mass, product, userId));
    }

    public AddedProduct getProduct(int index) {
        return list.get(index);
    }
}
