package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.singletonPattern;

public class TypeTwo {
    private volatile static TypeTwo instance;

    private TypeTwo() {

    }

    public static TypeTwo getInstance() {
        if (instance == null) {
            synchronized (TypeTwo.class) {
                if (instance == null) {
                    instance = new TypeTwo();
                }
            }
        }
        return instance;
    }
}
