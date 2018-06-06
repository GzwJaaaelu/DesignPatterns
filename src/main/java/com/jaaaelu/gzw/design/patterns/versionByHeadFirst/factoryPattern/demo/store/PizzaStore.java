package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.factoryPattern.demo.store;

import com.jaaaelu.gzw.design.patterns.versionByHeadFirst.factoryPattern.demo.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
//        //  Version One
//        Pizza pizza = SimplePizzaFactory.createPizza(type);

        //  Version Two
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * 当我们想要为披萨店开通加盟店的时候，我们就需要声明一个工厂方法，用于替换掉 SimplePizzaFactory.createPizza(type);
     * 因为加盟店可能需要做出他们自己的风味，这时候我们就将具体的实现放在子类中
     * Version Two
     *
     * @param type Pizza 类型
     * @return Pizza
     */
    protected abstract Pizza createPizza(String type);
}
