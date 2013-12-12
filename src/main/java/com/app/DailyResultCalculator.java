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
    private double mass;
    private double fat;
    private double kiloCalories;
    private double protein;
    private double carbohydrate;

    public DailyResultCalculator(ArrayList<AddedProduct> list) {
        for (AddedProduct l : list) {
            this.mass += l.getMass();
            this.fat += l.getProduct().getFat();
            this.protein += l.getProduct().getProtein();
            this.kiloCalories += l.getProduct().getKiloCalories();
            this.carbohydrate += l.getProduct().getCarbohydrate();
        }
    }
    public double getMass() {
        return round(mass);
    }

    public double getFat() {
        return round(fat);
    }

    public double getKiloCalories() {
        return round(kiloCalories);
    }

    public double getProtein() {
        return round(protein);
    }

    public double getCarbohydrate() {
        return round(carbohydrate);
    }
    public static double round(double d) {
        double n = (  (double)Math.round(d * 10000L)  ) / 10000L;
        return n;
    }
}
