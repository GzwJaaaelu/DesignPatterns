package com.jaaaelu.gzw.design.patterns.versionByAndroid.singletonPattern.demo;

public class InnerStatic {

    private InnerStatic() {
    }

    public static InnerStatic getInstance() {
        return InnerStaticHolder.Instance;
    }

    private static class InnerStaticHolder {
        private static final InnerStatic Instance = new InnerStatic();
    }
}
