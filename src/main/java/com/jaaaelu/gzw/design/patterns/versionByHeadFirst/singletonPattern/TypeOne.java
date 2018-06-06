package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.singletonPattern;

public class TypeOne {
    private static TypeOne instance = new TypeOne();

    private TypeOne() {}

    public static TypeOne getInstance() {
        return instance;
    }
}
