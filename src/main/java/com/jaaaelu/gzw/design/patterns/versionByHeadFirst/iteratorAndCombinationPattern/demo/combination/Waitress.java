package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.iteratorAndCombinationPattern.demo.combination;

import java.util.Iterator;

/**
 * 改版后的服务员代码又变得简单了，只需要调用 print 就会全部打印出来
 */
public class Waitress {
    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        System.out.println("\nVEGETARIAN MENU\n----");
        Iterator iterator = allMenus.createIterator();
        while (iterator.hasNext()) {
            MenuComponent component = (MenuComponent) iterator.next();
            try {
                if (component.isVegetarian()) {
                    component.print();
                }
            } catch (UnsupportedOperationException ignored) {

            }
        }
    }
}
