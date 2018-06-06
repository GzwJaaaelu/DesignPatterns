package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.iteratorAndCombinationPattern.demo.iterator;

import java.util.Iterator;

public class DinerMenu implements Menu {
    private static final int MAX_ITEM = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEM];

        createData();
    }

    private void createData() {
        addItem("AB", "BB", true, 2.99);
        addItem("CD", "DD", false, 1.99);
        addItem("EE", "FF", true, 2.59);
        addItem("G", "HH", true, 3.99);
    }

    private void addItem(String name, String desc, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, desc, vegetarian, price);
        if (numberOfItems >= MAX_ITEM) {
            System.out.println("Sorry,menu is full! Can't add item to menu.");
        } else {
            menuItems[numberOfItems] = item;
            numberOfItems++;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    //  当我们用了 DinerMenuIterator 之后其实就可以注释掉上面的 getMenuItems() 了
    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator();
    }

    class DinerMenuIterator implements Iterator<MenuItem> {
        int position = 0;

        @Override
        public boolean hasNext() {
            return position < menuItems.length && menuItems[position] != null;
        }

        @Override
        public MenuItem next() {
            return menuItems[position++];
        }
    }
}
