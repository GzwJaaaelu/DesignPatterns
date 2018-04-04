package com.jaaaelu.gzw.design.patterns.factoryPattern.demo.material;

/**
 * 抽象工厂
 *
 * 创建一组相关的产品
 */

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}
