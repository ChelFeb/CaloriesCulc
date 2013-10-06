package com.app;

import java.util.ArrayList;

public class AllProductsList {

    ArrayList<Product> list;

    public AllProductsList() {
        list = new ArrayList<Product>();
        list.add(new Product("Соевое мясо", 350, 50, 1, 30));
        list.add(new Product("Фасоль", 131, 8.5, 7, 20.6));
        list.add(new Product("Рыбка тунец", 145, 28.2, 3.6, 0));
    }
    public ArrayList<Product> getList() {
        return list;
    }

}
