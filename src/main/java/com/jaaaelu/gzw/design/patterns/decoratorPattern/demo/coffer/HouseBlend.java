package com.jaaaelu.gzw.design.patterns.decoratorPattern.demo.coffer;

/**
 * 混合咖啡
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    protected double cost() {
        return 0.89;
    }
}
