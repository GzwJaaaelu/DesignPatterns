package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.factoryPattern;

public class FactoryPattern {
    //  第四章 工厂模式

    //  new 其实也是“具体”，当你使用 new 时，你的确在实例化一个具体类，所以用的确实是实现，而不是接口。而代码绑着具体类
    //  会导致代码更脆弱，更缺乏弹性

    //  再一次，我们应该“找出变化的方面，把他们从不变的部分分离出来”

    //  所有的工厂模式都用来封装对象的创建。工厂方法模式通过让子类决定该创建的对象是什么，来达到将对象创建的过程封装的目的

    //  简单工厂定义，如 SimplePizzaFactory

    //  工厂方式模式：定义了一个创建对象的接口，但由子类决定要实例化哪个。工厂方法让类把实例化推迟到子类

    //  简单工厂的做法，将对象创建封装起来，但是简单工厂不具备工厂方法的弹性，因为简单工厂不能变更正在创建的产品。而工厂
    //  方法是创建一个框架，让子类决定要如何实现

    //  当你直接实例化一个对象时，就是依赖它的具体类

    //  设计原则
    //  1.要依赖抽象，不要依赖具体（依赖倒置原则，不能让高层组件依赖底层组件，而且，不关高层组件还是底层之间，两着都应该
    //  依赖于抽象，所谓“高层”组件，是有其他底层组件定义其行为的类）

    //  一些帮你避免范围依赖倒置的原则（可参考，尽量达到要求，并不需要完全随时遵循，你也应该知道什么可以违反）：
    //  - 变量不可以持有具体类的引用（如果使用 new 就会持有具体类的引用，你可以改用工厂来避免这样的做法）
    //  - 不要让类派生自具体类（如果派生自具体类，你就会依赖具体类，请派生自一个抽象）
    //  - 不要覆盖基类中已实现的方法（如果覆盖基类已实现的方法，那么你的基类就不是一个真正适合被继承的抽象，基类中已实现
    //  的方法，应该由所有子类共享）

    //  抽象工厂模式：提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类（创建一组相关产品，一组、相关）

    //  要点：
    //  - 所有工厂都是用来封装对象的创建
    //  - 简单工厂，虽然不是真正的设计模式，但仍不失为一个简单的方法，可以将用户程序从具体类解耦
    //  - 工厂方法使用继承：把对象的创建委托给子类，子类实现工厂方法来创建对象
    //  - 抽象工厂使用对象组合，对象的创建被实现在工厂接口所暴露出来的方法中
    //  - 所有工厂模式都通过减少应用程序和具体类之间的依赖促进松耦合
    //  - 工厂方法允许类将实例化延迟到子类进行
    //  - 抽象工厂创建相关的对象家族，而不需要依赖他们的具体类
    //  - 依赖倒置原则，知道我们避免依赖具体类型，要尽量依赖抽象
    //  - 工厂是很有威力的技巧，帮助我们针对抽象编程，而不要针对具体类编程
}