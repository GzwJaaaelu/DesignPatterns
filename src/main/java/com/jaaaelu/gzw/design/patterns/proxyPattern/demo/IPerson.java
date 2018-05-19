package com.jaaaelu.gzw.design.patterns.proxyPattern.demo;

public interface IPerson {

    //  虽然我们接口中提供了所有这些设置与获取方法，但是，这个类中，对于当前用于来说只能操作个人信息，而不能修改自己打分，
    //  对于其他用户不能修改别人的个人信息，但是可以给别人打分，这时候我需要为实现类创建一个保护代理

    String getName();

    void setName(String name);

    String getGender();

    void setGender(String gender);

    int getHotOrNotRating();

    void setHotOrNotRating(int rating);
}
