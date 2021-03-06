package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.observerPattern;

public class ObserverPattern {
    //  第二章 观察者模式

    //  出版者 + 订阅者 = 观察者

    //  观察者模式：定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新

    //  其间的依赖是如何产生的？
    //  因为主题是真正拥有数据的人，观察者是主题的依赖者，在数据变化时更新，这样比起让很多对象控制同一份数据来，可以得到
    //  更干净的 OO 设计

    //  当两个对象之间松耦合，它们依然可以交互，但是不太清楚彼此的细节。观察者模式提供了一种对象设计，让主题和观察者之间
    //  松耦合
    //  为什么呢
    //  关于观察者的一切，主题只知道观察者实现了某个接口（也就是 Observer 接口）。主题不需要知道观察者的具体类是谁、做了
    //  些什么或其他任何细节
    //  主题唯一依赖的东西是一个实现 Observer 接口的对象列表
    //  改变主题或者观察者其中一方，并不会影响另一方（因为松耦合）
    //  也可以独立的复用主题或观察者（因为松耦合）

    //  设计原则
    //  1.为了交互对象之间的松耦合设计而努力（松耦合的设计之所以能让我们建立弹性的 OO 系统，能够应对变化，是因为对象之间
    //  的互相依赖讲到了最低）

    //  第一章提到了三个设计原则，我们来看一下观察者模式是如何遵循此原则的：
    //  1.找出程序中变化的方面，然后将其和固定不变的方面相分离
    //  答：在观察者模式中，会改变的是主题的状态，以及观察者的数目和类型。用这个模式，你可以改变依赖于主题状态的对象，却
    //  不必改变主题。这就叫提前规划
    //  2.针对接口编程，不针对实现编程
    //  答：主题与观察者都是用接口：观察者利用主题的接口向主题注册，而主题利用观察者接口通知观察者。这样可以让两者之间
    //  运行正常，又同时具有松耦合的优点
    //  3.多用组合，少用继承
    //  答：观察者模式利用“组合”将许多观察者组合进主题中。对象之间的这种关系不是通过继承产生的，而是在运行时利用组合的
    //  方式产生的

    //  要点：
    //  - 观察者模式定义了对象之间一对多的关系
    //  - 主题（也就是被观察者）用一个共同的接口来更新观察者
    //  - 观察者和被观察者之间用松耦合方式结合，被观察者不知道观察者的细节，只知道观察者实现了观察者接口
    //  - 使用此模式时，你可从被观察者处推或拉数据（然而，推的方式被认为是更“正确”）
    //  - 有多个观察者时，不可以依赖特定的通知顺序
    //  - Java 有多种观察者模式的实现，包括了通用的 java.util.Observable
    //  - 要注意 java.util.Observable 实现上所带来的一些问题
    //  - 如果有必要的话，可以实现自己的 Observable，这并不难，不要害怕
    //  - Swing 大量使用观察者模式，需要 GUI 框架也是如此
    //  此模式也被应用在许多地方，例如：JavaBeans、RMI
}
