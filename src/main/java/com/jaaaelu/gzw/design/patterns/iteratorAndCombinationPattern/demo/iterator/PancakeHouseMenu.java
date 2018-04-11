package com.jaaaelu.gzw.design.patterns.iteratorAndCombinationPattern.demo.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        createData();
    }

    private void createData() {
        addItem("A", "B", true, 2.99);
        addItem("C", "D", false, 1.99);
        addItem("E", "F", true, 2.59);
        addItem("G", "H", true, 3.99);
    }

    private void addItem(String name, String desc, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, desc, vegetarian, price);
        menuItems.add(item);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
