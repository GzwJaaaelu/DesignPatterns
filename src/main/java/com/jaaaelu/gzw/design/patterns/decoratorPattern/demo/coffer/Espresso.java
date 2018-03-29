package com.jaaaelu.gzw.design.patterns.decoratorPattern.demo.coffer;

/**
 * 浓缩咖啡
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    protected double cost() {
        return 1.99;
    }
}
