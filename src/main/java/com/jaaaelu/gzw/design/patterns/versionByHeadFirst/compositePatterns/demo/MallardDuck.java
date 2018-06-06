package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.compositePatterns.demo;

/**
 * 一只真正的鸭子
 */
public class MallardDuck implements Quackable {
    private Observable observable;

    public MallardDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
