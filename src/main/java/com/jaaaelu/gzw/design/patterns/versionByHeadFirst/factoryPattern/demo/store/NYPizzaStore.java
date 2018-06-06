package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.factoryPattern.demo.store;

import com.jaaaelu.gzw.design.patterns.versionByHeadFirst.factoryPattern.demo.material.NYPizzaIngredientFactory;
import com.jaaaelu.gzw.design.patterns.versionByHeadFirst.factoryPattern.demo.material.PizzaIngredientFactory;
import com.jaaaelu.gzw.design.patterns.versionByHeadFirst.factoryPattern.demo.pizza.*;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new NYStyleCheesePizza();
                break;
            case "veggie":
                pizza = new NYStyleVeggiePizza();
                break;
            case "clam":
                pizza = new NYStyleClamPizza();
                break;
            case "pepperoni":
                pizza = new NYStylePepperoniPizza();
                break;
        }
        return pizza;
    }

    //  利用抽象工厂
    //  这时候其实可以把这个方法放在基类里面
    //  我们只需要不一样的披萨原料工厂即可
    protected Pizza createPizzaVersionTwo(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
        switch (type) {
            case "cheese":
                pizza = new CheesePizza(factory);
                break;
            case "clam":
                pizza = new ClamPizza(factory);
                break;
            //  其他省略
        }
        return pizza;
    }
}
