package com.jaaaelu.gzw.design.patterns.decoratorPattern.demo.coffer;

/**
 * 奶泡调料
 *
 * 奶泡是一个装饰者
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    protected double cost() {
        return 0.1 + beverage.cost();
    }
}
