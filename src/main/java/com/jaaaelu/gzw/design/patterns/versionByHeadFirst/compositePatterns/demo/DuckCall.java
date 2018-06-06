package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.compositePatterns.demo;

/**
 * 鸭鸣器，猎人使用的工具，听起来也是呱呱叫，但是并不十分像真的鸭叫声
 */
public class DuckCall implements Quackable {

    @Override
    public void quack() {
        System.out.println("Kwak");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
