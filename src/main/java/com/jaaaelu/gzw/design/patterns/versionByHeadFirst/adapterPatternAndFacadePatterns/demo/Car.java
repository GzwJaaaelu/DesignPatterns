package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.adapterPatternAndFacadePatterns.demo;

/**
 * 最少认识原则
 * <p>
 * 如何你要赢得太多的朋友和影响太多的对象？这个原则提供了一些方针：只调用属于以下范围的方法：
 * - 该对象本身
 * - 被当做方法的参数而传递进来的对象
 * - 此方法所创建或实例化的任何对象
 * - 对象的任何组件（组合的）
 */
public class Car {
    //  Car 类的一个组件，我们能够调用他的方法
    private Engine engine;

    public Car() {
        //  初始化发动机
        engine = new Engine();
    }

    //  Key 是当做参数传递进来的对象，其方法可以被调用
    public void start(Key key) {
        //  在这里创建了一个新的对象，他的方法可以被调用
        Doors doors = new Doors();

        //  被当参数传递进来的对象，其方法可以被调用
        boolean authorized = key.turns();

        if (authorized) {
            //  可以调用对象组件的方法
            engine.start();
            //  可以调用一个对象内的本地方法
            updateDashboardDisplay();
            //  可以调用你所创建或实例化的对象的方法
            doors.lock();
        }
    }

    private void updateDashboardDisplay() {

    }
}

class Engine {

    public void start() {

    }
}

class Key {

    public boolean turns() {
        return false;
    }
}

class Doors {

    public void lock() {

    }
}