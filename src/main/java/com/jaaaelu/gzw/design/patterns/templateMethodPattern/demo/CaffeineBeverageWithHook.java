package com.jaaaelu.gzw.design.patterns.templateMethodPattern.demo;

/**
 * 相比 CaffeineBeverage 之下，CaffeineBeverageWithHook 多了对模版方法进行挂钩，从而可以控制算法结构
 *
 * 钩子是一种被声明在抽象类中的方法，但只有空的或者默认的实现。钩子的存在，可以让子类又能对算法的不同点进行挂钩。要不要挂
 * 钩，由子类自行决定
 */
public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        //  这里我们加上了小小的条件语句，也就是钩子
        //  我们通过钩子控制咖啡因饮料是否执行某部分算法
        //  这里就是控制是否饮料中要加入调料
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    protected abstract void brew();

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    //  这里定义了一个方法，通常是空的或是缺省的实现
    //  这就是一个钩子，子类可以实现这个方法，但不见得一定这么做
    private boolean customerWantsCondiments() {
        return true;
    }

    protected abstract void addCondiments();
}
