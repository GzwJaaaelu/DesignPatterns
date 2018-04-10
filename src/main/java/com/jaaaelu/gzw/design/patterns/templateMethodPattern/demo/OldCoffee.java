package com.jaaaelu.gzw.design.patterns.templateMethodPattern.demo;

/**
 * 咖啡冲泡法
 * 1.把水煮沸
 * 2.用沸水冲泡咖啡
 * 3.把咖啡倒进杯子
 * 4.加糖和牛奶
 */
public class OldCoffee {

    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    //  下面的每个方法都实现了算法中的一个步骤：
    //  煮沸水、冲泡咖啡、把咖啡倒进杯子、加糖和奶

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void addSugarAndMilk() {
        System.out.println("Adding Sugar and Milk");
    }
}
