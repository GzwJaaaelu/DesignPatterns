package com.jaaaelu.gzw.design.patterns.decoratorPattern.demo.coffer;

public abstract class Beverage {
    protected String description = "Unknown Beverage";
    private double size = 0;

    public String getDescription() {
        return description;
    }

    protected abstract double cost();

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
