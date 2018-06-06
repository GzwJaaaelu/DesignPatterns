package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.proxyPattern.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {
    private IPerson person;

    public NonOwnerInvocationHandler(IPerson person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("get")) {
            //  如果调动 getXXX 方法可以进行操作
            return method.invoke(person, args);
        } else if (method.getName().equals("setHotOrNotRating")) {
            //  可以给别人打分
            return method.invoke(person, args);
        } else if (method.getName().startsWith("set")) {
            //  但除了打分你之外的 set 方法都无法调用
            throw new IllegalAccessException();
        }
        return null;
    }
}
