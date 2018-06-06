package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.iteratorAndCombinationPattern.demo.combination;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
    private String name;
    private String desc;
    //  是否素食
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String desc, boolean vegetarian, double price) {
        this.name = name;
        this.desc = desc;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return desc;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {
        System.out.print("    " + getName());
        if (isVegetarian()) {
            System.out.print(" (v) ");
        }
        System.out.println("， "+ getPrice());
        System.out.println("    -- " + getDescription());
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new NullIterator();
    }
}
