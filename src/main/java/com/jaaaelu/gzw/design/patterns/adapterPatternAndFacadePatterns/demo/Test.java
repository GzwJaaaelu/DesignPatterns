package com.jaaaelu.gzw.design.patterns.adapterPatternAndFacadePatterns.demo;

import com.jaaaelu.gzw.design.patterns.adapterPatternAndFacadePatterns.demo.adapter.Duck;
import com.jaaaelu.gzw.design.patterns.adapterPatternAndFacadePatterns.demo.adapter.MallardDuck;
import com.jaaaelu.gzw.design.patterns.adapterPatternAndFacadePatterns.demo.adapter.TurkeyAdapter;
import com.jaaaelu.gzw.design.patterns.adapterPatternAndFacadePatterns.demo.adapter.WildTurkey;

public class Test {

    public static void main(String[] args){
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("\nThe Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        //  如果它走起路来像只鸭子，叫起来像只鸭子那么它可能时一直包装了鸭子适配器的火鸡
        //  这里看到了它虽然方法调用起来和鸭子是一模一样的，但是实际上它只是只被包装了的火鸡
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
