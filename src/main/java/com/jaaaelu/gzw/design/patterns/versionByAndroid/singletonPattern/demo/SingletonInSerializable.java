package com.jaaaelu.gzw.design.patterns.versionByAndroid.singletonPattern.demo;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonInSerializable implements Serializable {
    private static final long serialVersionUID = 0L;
    private static final SingletonInSerializable Instance = new SingletonInSerializable();

    private SingletonInSerializable() {
    }

    public static SingletonInSerializable getInstance() {
        return Instance;
    }

    private Object readResolve() throws ObjectStreamException {
        // instead of the object we're on,
        // return the class variable INSTANCE
        return Instance;
    }
}
