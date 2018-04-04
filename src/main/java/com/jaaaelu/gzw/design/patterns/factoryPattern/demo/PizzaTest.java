package com.jaaaelu.gzw.design.patterns.factoryPattern.demo;

import com.jaaaelu.gzw.design.patterns.factoryPattern.demo.pizza.Pizza;
import com.jaaaelu.gzw.design.patterns.factoryPattern.demo.store.NYPizzaStore;
import com.jaaaelu.gzw.design.patterns.factoryPattern.demo.store.PizzaStore;

public class PizzaTest {

    public static void main(String[] args){
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza.getName());
    }
}
