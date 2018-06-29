package com.jaaaelu.gzw.design.patterns.versionByAndroid.singletonPattern.demo;

public class Hungry {
    private static final Hungry Instance = new Hungry();

    private Hungry() {
    }

    public static Hungry getInstance() {
        return Instance;
    }
}
