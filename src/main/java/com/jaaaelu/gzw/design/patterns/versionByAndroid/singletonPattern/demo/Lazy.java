package com.jaaaelu.gzw.design.patterns.versionByAndroid.singletonPattern.demo;

public class Lazy {
    private static Lazy Instance;

    private Lazy() {

    }

    public static synchronized Lazy getInstance() {
        if (Instance == null) {
            Instance = new Lazy();
        }
        return Instance;
    }
}
