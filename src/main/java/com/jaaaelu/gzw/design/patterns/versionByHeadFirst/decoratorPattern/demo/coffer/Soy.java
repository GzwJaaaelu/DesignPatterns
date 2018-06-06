package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.decoratorPattern.demo.coffer;

/**
 * 豆浆调料
 *
 * 豆浆是一个装饰者
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    protected double cost() {
        return 0.15 + beverage.cost();
    }
}
