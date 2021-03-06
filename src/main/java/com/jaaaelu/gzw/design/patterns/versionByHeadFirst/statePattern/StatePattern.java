package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.statePattern;

public class StatePattern {
    //  第十章 状态模式

    //  作者提供的基本常识：策略模式和状态模式是双胞胎，在出生时才分开
    //  你已经知道，策略模式是围绕可以互换的算法来创建成功业务的。而状态模式走的是更崇高的录，它通过改变对象内部状态来帮
    //  助对象控制自己的行为

    //  状态模式：允许对象再内部状态改变时改变它的行为，对象看起来好像修改了它的类

    //  这个描述中，第一部分其实是说，这个模式将状态封装成独立的类，并将动作委托到代表当前状态的对象，我们知道行为会随着
    //  内部状态而改变
    //  而第二部分的意思是，从客户的角度来看：如果说你使用的对象完全能够改变它的行为，那么你会觉得，这个对象实际上是从别
    //  的类实例化而来的。然而，实际上，我们是在使用组合通过简单引用不同的状态对象来照成类改变的假象

    //  策略模式和状态模式看上去非常像，但这两个模式差别在于它们的“意图”
    //  以状态模式而言，我们将一群行为封装在状态对象中，context（也就是例子中的 GumballMachine）的行为随时可委托到那些状态
    //  中的一个。随着时间的流式，当前状态在状态对象集合中游走改变，以反映出 context 内部的状态，因此 context 的行为也会
    //  跟着改变。但是 context 的客户对于状态对象了解不多，甚至根本是浑然不觉
    //  而以策略模式而言，客户通常主动指定 Context 所需要的策略对象是哪一个。现在，固然策略模式让我们具有弹性，能够在运行
    //  时改变策略，但对于某个 context 对象来说，通常都只有一个最适当的策略对象。比如第一章提到的鸭子

    //  我们把策略模式线程是除了继承之外的一种弹性替代方案。有了策略模式，我们可以通过组合不同的对象来改变行为
    //  我们把状态模式线程是不用在 context 中防止许多条件判断的替代方案。通过将行为包装进状态对象中，你可以通过 context
    //  内简单的改变状态对象来改变 context 的行为

    //  连连看总结（书中的连连看）：
    //  - 状态：封装基于状态的行为，并将行为委托到当前状态
    //  - 策略：将可以互换的行为封装起来，然后使用委托的方法，决定使用哪一个行为
    //  - 模板方法：由子类决定如何实现算法中的某些步骤

    //  要点：
    //  - 状态模式允许一个对象基于内部状态而拥有不同的行为
    //  - 和程序状态机，状态模式用类代表状态
    //  - Context 会将行为委托给当前状态对象
    //  - 通过将每个状态封装进一个类，我们把以后做的任何改变局部化了
    //  - 状态模式和策略模式有相同的类图，但是他们的意图不同
    //  - 策略模式通常会用行为或算法来配置 Context 类
    //  - 状态转换可以由 State 类或 Context 类控制
    //  - 使用状态模式通常会导致设计中类的数目大量增加
    //  - 状态类可以被多个 Context 实例共享
}
