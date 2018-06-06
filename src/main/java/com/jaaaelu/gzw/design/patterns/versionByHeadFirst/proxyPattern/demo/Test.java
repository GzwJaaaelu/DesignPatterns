package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.proxyPattern.demo;

import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args){
        IPerson joe = getJoe();
        IPerson own = getOwnProxy(joe);
        System.out.println(own.getName());
        own.setName("Joe X");
        System.out.println(own.getName());
        try {
            own.setHotOrNotRating(5);
        } catch (Exception e) {
            e.printStackTrace();
        }

        IPerson nonOwn = getNonOwnProxy(joe);
        System.out.println(nonOwn.getName());
        nonOwn.setHotOrNotRating(5);
        System.out.println(nonOwn.getHotOrNotRating());
        try {
            nonOwn.setName("Joe X");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static IPerson getJoe() {
        PersonImpl joe = new PersonImpl();
        joe.setName("Joe");
        joe.setGender("Man");
        return joe;
    }

    private static IPerson getOwnProxy(IPerson person) {
        return (IPerson) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    private static IPerson getNonOwnProxy(IPerson person) {
        return (IPerson) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }
}
