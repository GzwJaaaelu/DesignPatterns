package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.templateMethodPattern.demo;

/**
 * 我们找到 Coffee 和 Tea 和共性，都是咖啡因饮料，从而我们创建一个基类，让其为我们去除重复代码
 *
 * 我们做了什么？将咖啡因饮料的制作步骤提取抽象，变成如下步骤：
 * 1.把水煮沸
 * 2.冲泡
 * 3.把咖啡倒进杯子
 * 4.加调料
 *
 * 我们将一致 1、3 提取出来，亲自完成，而 2、4 依据子类不同而自己实现
 *
 * 而这个咖啡因饮料类的结构其实就是用了模板方法模式
 * 模板方法定义了一个算法的步骤，并允许子类为一个或多个步骤提供实现
 *
 * CaffeineBeverage 类专注再算法本省，而由子类提供完整的实现，这样使得算法只存在与一个地方，容易修改，并且将代码复用最大化
 */
public abstract class CaffeineBeverage {

    //  我们试图改进 Coffee 和 Tea，去掉其中重复的代码
    //  我们可能最容易想到的方式就是 将 prepareRecipe 设置为抽象方法，然后再父类中 boilWater 和 pourInCup，从而子类 Coffee
    //  和 Tea 只需要重新实现 prepareRecipe 并在对应子类中写出对应的不同方法即可，如 brewCoffeeGrinds 与 steepTeaBag

    //  但是当我们再仔细查看冲泡方法时发现其实对应 2、4 其实也可以将其抽象出来

    //  prepareRecipe 是我们的模板方法。为什么呢？
    //  1.它是一个方法
    //  2.它用作一个算法的模板，例子中用来制作咖啡因饮料
    //  在这个模板中，算法内的每一个步骤都被一个方法代表了
    //  某些方法由这个类处理，某些方法则是自己处理
    //  这里我们添加 final 前缀，防止方法被重写，从而改变算法结构
    final void prepareRecipe() {
        boilWater();
        //  不论是冲泡还是浸泡其实差异不大，所以我们用了一个新名称来统一方法，比如 brew
        brew();
        pourInCup();
        //  再看加糖和牛奶和加柠檬也很相似：都是再饮料中加入调料，所以我们也有一个新的名称来解决统一问题，如 addCondiments
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    protected abstract void brew();

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected abstract void addCondiments();
}
