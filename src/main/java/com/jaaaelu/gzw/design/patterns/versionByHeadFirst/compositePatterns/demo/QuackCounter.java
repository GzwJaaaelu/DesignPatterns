package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.compositePatterns.demo;

/**
 * QuackCounter 是一个装饰者，用来记录被装饰呱呱的鸭子
 * 这样我们就在不改变鸭子的情况下，计算出了呱呱叫的次数
 */
public class QuackCounter implements Quackable {
    private static int numberOfQuacks;
    private Quackable duck;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
