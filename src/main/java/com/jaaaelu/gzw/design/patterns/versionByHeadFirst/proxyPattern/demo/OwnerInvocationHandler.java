package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.proxyPattern.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
    private IPerson person;

    public OwnerInvocationHandler(IPerson person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("get")) {
            //  如果调动 getXXX 方法可以进行操作
            return method.invoke(person, args);
        } else if (method.getName().equals("setHotOrNotRating")) {
            //  自己无法给自己打分
            throw new IllegalAccessException();
        } else if (method.getName().startsWith("set")) {
            return method.invoke(person, args);
        }
        return null;
    }
}
