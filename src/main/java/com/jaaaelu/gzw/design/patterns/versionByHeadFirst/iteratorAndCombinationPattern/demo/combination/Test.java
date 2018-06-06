package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.iteratorAndCombinationPattern.demo.combination;


public class Test {

    public static void main(String[] args) {
        //  先创建所有的菜单对象
        MenuComponent pancakeHouseMenu = new Menu("Pancake House Menu", "Breakfast");
        MenuComponent dinerMenu = new Menu("Diner Menu", "Lunch");
        MenuComponent cafeMenu = new Menu("Cafe Menu", "Dinner");
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Dessert of course!");

        //  我们需要一个最顶层的菜单
        MenuComponent allMenus = new Menu("All Menus", "All menu combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("Pasta", "xxxxxxx", true, 3.89));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie", "xxxxxxx", true, 1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
