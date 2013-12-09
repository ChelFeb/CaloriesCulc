package com.app;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Chelfeb
 * Date: 09.12.13
 * Time: 18:36
 * To change this template use File | Settings | File Templates.
 */
public class DailyResultCalculator {
    private int mass;
    private int fat;
    private int kiloCalories;
    private int protein;
    private int carbohydrate;

    public DailyResultCalculator(ArrayList<AddedProduct> list) {
        for (AddedProduct l : list) {
            this.mass += l.getMass();
            this.fat += l.getProduct().getFat();
            this.protein += l.getProduct().getProtein();
            this.kiloCalories += l.getProduct().getKiloCalories();
            this.carbohydrate += l.getProduct().getCarbohydrate();
        }
    }
    public int getMass() {
        return mass;
    }

    public int getFat() {
        return fat;
    }

    public int getKiloCalories() {
        return kiloCalories;
    }

    public int getProtein() {
        return protein;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }
}
