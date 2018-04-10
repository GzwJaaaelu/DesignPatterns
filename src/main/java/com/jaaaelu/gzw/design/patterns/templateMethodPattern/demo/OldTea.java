package com.jaaaelu.gzw.design.patterns.templateMethodPattern.demo;

/**
 * 茶冲泡法
 * 1.把水煮沸
 * 2.用沸水浸泡茶叶
 * 3.把茶叶倒进杯子
 * 4.加柠檬
 */
public class OldTea {

    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    //  注意，boilWater 和 pourInCup 这两个方法完全和咖啡一样，也就是说这里出现了重复的代码

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void steepTeaBag() {
        System.out.println("Steeping the Tea");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void addLemon() {
        System.out.println("Adding Lemon");
    }
}
