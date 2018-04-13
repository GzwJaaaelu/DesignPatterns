package com.jaaaelu.gzw.design.patterns.statePattern.demo;

/**
 * 我们并没有在之前的代码上修改，而是直接新写了这些代码
 *
 * 通过从结构上的改变实现，我们已经做到了以下几点：
 * 1.将每个状态的行为局部化到它自己的类中
 * 2.将容易苍生问提的 if 语句（我这里老版本的用的 switch）删除，以方便日后的维护
 * 3.让每个状态“对修改关闭”，让糖果机“对扩展开放”，因为可以加入新的状态类（接下来的赢家状态就是）
 * 4.创建一个新的代码基类结构，这更能反映设计需求，而且更容易阅读和理解
 */
public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
