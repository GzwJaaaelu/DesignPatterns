package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.adapterPatternAndFacadePatterns.demo.adapter;

public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm fly a short distance");
    }
}
