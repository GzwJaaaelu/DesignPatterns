package com.jaaaelu.gzw.design.patterns.factoryPattern.demo.pizza;

import com.jaaaelu.gzw.design.patterns.factoryPattern.demo.material.*;

import java.util.ArrayList;

public abstract class Pizza {
    protected String name;
//    protected String dough;
//    protected String sauce;
    protected ArrayList<String> toppings = new ArrayList<>();
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
