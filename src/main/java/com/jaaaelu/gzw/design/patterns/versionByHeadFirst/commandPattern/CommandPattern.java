package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.commandPattern;

public class CommandPattern {
    //  第六章 命令模式

    //  命令模式：将“请求”封装成对象，以便使用不同的请求、队列或日志来参数化其他对象。命令模式也支持可撤销的操作

    //  命令模式的更多用途：
    //  1.队列请求（工作队列类和进行计算的对象之间完全解耦）
    //  2.日志请求

    //  要点
    //  - 命令模式将发出请求的对象和执行请求的对象解耦
    //  - 在被解耦的两者之间是通过命令对象进行沟通的。命令对象封装了接收者和一个或一组动作
    //  - 调用者通过调用命令的 execute() 发出请求，这会使得接收者的动作被调用
    //  - 调用者可以接受命令当做参数，甚至运行时动态的设置
    //  - 命令可以支持撤销，做法是实现一个 undo() 方法来会到 execute() 被执行前的状态
    //  - 宏命令是命令的一种简单眼神，允许调用多个命令。宏方法也可以支持撤销
    //  - 实际操作时，很常见使用“聪明”命令对象，也就是直接实现了请求，而不是见工作委托给接收者（委托是明智的）
    //  - 命令也可以用来实现日志和事务系统
}
