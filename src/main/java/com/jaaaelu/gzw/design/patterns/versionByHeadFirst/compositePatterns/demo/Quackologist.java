package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.compositePatterns.demo;

public class Quackologist implements Observer {

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
