package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.compositePatterns.demo;

/**
 * 使用适配器模式将鹅适配成鸭子
 */
public class GooseAdapter implements Quackable {
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
