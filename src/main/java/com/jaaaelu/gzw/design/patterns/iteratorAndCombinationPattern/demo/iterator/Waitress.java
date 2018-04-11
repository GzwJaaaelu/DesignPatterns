package com.jaaaelu.gzw.design.patterns.iteratorAndCombinationPattern.demo.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    private Menu pancakeHouseMenu;
    private Menu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;


    }

    public void printMenuOld() {
//        ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
//        MenuItem[] lunchItems = dinerMenu.getMenuItems();
//
//        for (int i = 0; i < breakfastItems.size(); i++) {
//            MenuItem item = breakfastItems.get(i);
//            printItem(item);
//        }
//
//        for (int i = 0; i < lunchItems.length; i++) {
//            MenuItem item = lunchItems[i];
//            printItem(item);
//        }
    }

    public void printMenu() {
        Iterator<MenuItem> breakfastItems = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> lunchItems = dinerMenu.createIterator();

        printMenu(breakfastItems);
        printMenu(lunchItems);
    }

    //  这个时候我们就只要一个循环的代码块就可以了
    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            printItem(menuItem);
        }
    }

    private void printItem(MenuItem item) {
        if (item != null) {
            System.out.println(item.getName() + "   " + item.getPrice());
            System.out.println(item.getDesc());
        }
    }
}
