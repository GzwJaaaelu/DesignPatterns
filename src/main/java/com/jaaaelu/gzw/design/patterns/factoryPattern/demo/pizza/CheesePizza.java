package com.jaaaelu.gzw.design.patterns.factoryPattern.demo.pizza;

import com.jaaaelu.gzw.design.patterns.factoryPattern.demo.material.NYPizzaIngredientFactory;
import com.jaaaelu.gzw.design.patterns.factoryPattern.demo.material.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory factory;

    public CheesePizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    public CheesePizza() {
        this.factory = new NYPizzaIngredientFactory();
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
        for (String topping : toppings) {
            System.out.println("    " + topping);
        }
    }
}
