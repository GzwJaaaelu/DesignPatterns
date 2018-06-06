package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.compositePatterns.demo;

/**
 * 需求一：当我们写完鸭子之后，我们希望鸭子出现的时候，鹅也应该在附近
 * 假设我们想要在所有使用鸭子的地方使用鹅，毕竟鹅会叫、会飞、会游，和鸭子差不多，所以我们要怎么在这个模拟器中使用鹅呢
 * <p>
 * 需求二：统计一群鸭子中，会有多少呱呱叫声
 * 要求在不改变鸭子的情况下，计算出了呱呱叫的次数
 * <p>
 * 需求三：我们为何不见创建鸭子的程序集中在一个地方呢？顺便可以将创建于装饰的部分一同包装起来
 * <p>
 * 需求四：我们能否将鸭子思维一个集合？甚至是子集合，这样如果我们下一次命令，就能让整个集合的鸭子听命行事
 * <p>
 * 需求五：需要能够追踪个别的鸭子，实时追踪某些鸭子的呱呱叫
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory factory = new CountingDuckFactory();
        simulator.simulate(factory);
    }

    private void simulate(AbstractDuckFactory factory) {
//        Quackable mallardDuck = new MallardDuck();
//        Quackable duckCall = new DuckCall();
//        Quackable rubberDuck = new RubberDuck();

//        //  需求二
//        Quackable mallardDuck = new QuackCounter(new MallardDuck());
//        Quackable duckCall = new QuackCounter(new DuckCall());
//        Quackable rubberDuck = new QuackCounter(new RubberDuck());

        //  需求三
        Quackable mallardDuck = factory.createMallardDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();
        //  新增鹅（需求一）
        //  当然这里鹅的叫声不会被计算进去
        Quackable goose = new GooseAdapter(new Goose());

        //  需求四
        //  这里我们决定，只让 Flock 具有 add()，而不是给 Duck 添加这个方法
        //  OO 设计中的过程中，这种一直都是免不了的
        Flock flock = new Flock();
        flock.add(new MallardDuck());
        flock.add(duckCall);
        flock.add(rubberDuck);
        flock.add(goose);

        Quackologist quackologist = new Quackologist();
        flock.registerObserver(quackologist);

        System.out.println("Duck Simulator\n");

        simulate(mallardDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);
        System.out.println("");
        System.out.println("控制一群鸭子");
        simulate(flock);

        System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times.");
    }

    private void simulate(Quackable quackable) {
        quackable.quack();
    }
}
