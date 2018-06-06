package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.compositePatterns.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式允许我们像对待单个对象一样，对待对象集合
 * 这个类还用到了迭代器模式
 */
public class Flock implements Quackable {
    List<Quackable> quackables = new ArrayList<>();

    public void add(Quackable quacker) {
        quackables.add(quacker);
    }

    @Override
    public void quack() {
        for (Quackable quacker : quackables) {
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable quackable : quackables) {
            quackable.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }
}
