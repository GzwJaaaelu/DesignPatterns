package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.factoryPattern.demo.pizza;

import com.jaaaelu.gzw.design.patterns.versionByHeadFirst.factoryPattern.demo.material.NYPizzaIngredientFactory;
import com.jaaaelu.gzw.design.patterns.versionByHeadFirst.factoryPattern.demo.material.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
    PizzaIngredientFactory factory;

    public ClamPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    public ClamPizza() {
        this.factory = new NYPizzaIngredientFactory();
    }

    @Override
    public void prepare() {
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
        clams = factory.createClams();
    }
}
