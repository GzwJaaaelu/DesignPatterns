package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.iteratorAndCombinationPattern.demo.iterator;

public class Test {

    public static void main(String[] args) {
        //  我们先来说一下故事背景，两个餐馆合并了，一家做早餐，一家做午餐，他们同意统一菜单，用早餐店的菜单当做早餐的菜
        //  单，午餐店的菜单当做午餐的菜单，但是二者在菜单在菜单的数据结构上有些一些分歧，一个用的是 List 一个用的是数组，
        //  这样服务员在打印所有菜单时做的遍历会有一些小小的区别，从而不能实现代码复用（当然这只是 fori 的循环方式，当然
        //  也可以使用 foreach 的循环形式），而这个时候作者提供了一个改进方式，封装遍历（也就是封装变化的部分），从而引入
        //  了 Iterator
        Waitress waitress = new Waitress(new PancakeHouseMenu(), new DinerMenu());
        waitress.printMenuOld();

        System.out.println("--------------------------------------------");

        waitress.printMenu();
    }
}
