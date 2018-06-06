package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.factoryPattern.demo.pizza;

/**
 * 简单工厂
 * Version One
 */
public class SimplePizzaFactory {

    public static Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
        }
        return pizza;
    }
}
