package com.jaaaelu.gzw.design.patterns.iteratorAndCombinationPattern.demo.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    private Menu pancakeHouseMenu;
    private Menu dinerMenu;

    //  和上面不同，将所有菜单管理起来，然后通过遍历打印菜单
    //  这样就不用在打印菜单的地方写重复的代码了
    //  而且如果菜单躲起来的时候，构造的参数也要逐渐增多，不如将其放入容器中管理
    private ArrayList<Menu> menus;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
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
        //  虽然我们做了改进，但是如果当我们引入更多菜单的时候我们还是需要修改这里，所以作者建议我们将菜单的处理独立成一
        //  个对象
        Iterator<MenuItem> breakfastItems = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> lunchItems = dinerMenu.createIterator();

        printMenu(breakfastItems);
        printMenu(lunchItems);
    }

    public void printMenuModify() {
        //  修改后我们可以将所有菜单的列表管理起来，然后通过循环调用打印菜单的功能
        for (Menu menu : menus) {
            printMenu(menu.createIterator());
        }
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
            System.out.println(item.getName() + "   " + item.getPrice() + "     " + item.getDesc());
        }
    }
}
