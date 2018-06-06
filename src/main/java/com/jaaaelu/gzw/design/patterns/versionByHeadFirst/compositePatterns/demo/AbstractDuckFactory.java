package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.compositePatterns.demo;

public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();

    public abstract Quackable createDuckCall();

    public abstract Quackable createRubberDuck();
}
