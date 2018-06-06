package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.proxyPattern.demo;

public class PersonImpl implements IPerson {
    private String name;
    private String gender;
    private int rating;
    private int ratingCount = 0;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int getHotOrNotRating() {
        if (ratingCount == 0) return 0;
        return rating / ratingCount;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }
}
