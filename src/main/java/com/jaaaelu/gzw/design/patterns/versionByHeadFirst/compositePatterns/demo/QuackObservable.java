package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.compositePatterns.demo;

/**
 * 被观察者
 */
public interface QuackObservable {

    void registerObserver(Observer observer);

    void notifyObservers();
}
