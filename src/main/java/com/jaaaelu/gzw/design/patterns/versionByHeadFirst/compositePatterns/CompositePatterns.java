package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.compositePatterns;

public class CompositePatterns {
    //  第十二章 复合模式

    //  复合模式在一个解决方案中结合两个或多个模式，以解决一般或重复发生的问题

    //  MVC 模式（模型、视图、控制器）

    //  常见操作步骤
    //  1.你是用户——你和视图交互
    //  - 视图是模型的窗口。当你对视图做一些事时（比如说，按下播放按钮），视图就告诉控制器你做了什么。控制器会负责处理
    //  2.控制器要求模型改变状态
    //  - 控制器解读你的动作。如果你按下某个按钮，控制器会理解这个动作的意义，并告知模型如何做出对应的动作
    //  3.控制器也可能要求视图做改变
    //  - 当控制器从视图收到某一动作，结果可能是它也需要告诉视图改变其结果。比如说，控制器可以将界面上的某些按钮和菜单项
    //  变成有效或无效
    //  4.当模型状态改变时，模型会通知视图
    //  - 不管你做了某些动作（比方说按下按钮）还是内部有了某些改变（比方说播放清单的下一首歌开始），只要当模型内的东西改
    //  变时，模型都会通知视图它的状态改变了
    //  5.视图向模型询问状态
    //  - 视图直接从模型获取它的显示状态。比方说，当模型通知视图新歌开始播放，视图向模型询问歌名并显示出来。当控制器请求
    //  视图改变时，视图也可能向模型询问某些状态

    //  控制器的代码逻辑能否放在视图中？当然可以，但是并不建议这样，有两个原因：首先，这会让视图的代码变得更复杂，因为这
    //  样一来视图就有两个责任了，不但要管理用户界面，还要处理如何控制模型的逻辑。第二个原因，这么做会造成视图和模型之间
    //  的紧耦合，如果你想复用复用此视图来处理其他模型，这根本不可能。控制器把控制逻辑从视图中分离，让模型和视图之间解耦

    //  MVC 中的设计模式
    //  模型层：观察者模式 -> 模型层实现了观察者模式，当状态改变时，相关对象将持续更新。使用观察者模式，可以让模型完全独
    //  立与视图和控制器。同一个模型可以使用不同的视图，甚至可以同时使用多个视图
    //  控制器：策略模式 -> 视图和控制器实现了经典的策略模式：视图是一个对象，可以被调整使用不同的策略，而控制器提供了策
    //  略。视图只关心系统中可视的部分，对于任何界面行为，都委托给控制器处理。使用策略模式也可以让视图和模型之间的关系解
    //  耦，因为控制器负责和模型交互来传递用户的请求。对于工作是怎么完成的，视图毫不知情
    //  视图层：组合模式 -> 显示包含窗口、面板、按钮、文本标签等。每个显示组件如果不是组合节点（例如窗口），就是叶节点
    //  （例如按钮）。当控制器告诉视图更新时，只需要告诉视图最顶层的组件即可，组合会处理其余的事

    //  MVC 中，模型对视图的控制一无所知。换句话说，它们之间是完全解耦的。模型只知道，有一些观察者它需要通知。这正式观察
    //  者模式的美妙的地方。因为她知道只是观察者，而不是具体的类，知道信息越少耦合程度也就越少
    //  模型中还提供一些接口，供试图和控制器获得并设置状态
    //  控制器只是为视图实现行为，将来自视图的动作转为模型动作。所以控制器并不实现应用逻辑。而应该是模型实现应用逻辑，并
    //  决定如何响应动作。控制器也要做一些决定，决定调用哪个模型的哪个方法，但这并不能算是“应用逻辑”。应用逻辑指的是管
    //  理与操纵你的模型中的数据的代码

    //  要点
    //  - MVC 是复合模式，结合了观察者模式、策略模式和组合模式
    //  - 模型使用观察者模式，以便观察者更新，同时保持两者之间的解耦
    //  - 控制器是视图的策略，视图可以使用不同的控制器实现，得到不同的行为
    //  - 视图使用组合模式实现用户界面，用户界面通过组合了嵌套的组件，像面板、框架和按钮
    //  - 这些模式携手合作，把 MVC 模型的三层解耦，这样可以保持设计干净又有弹性
    //  - 适配器模式用来将新的模型适配成已有视图的视图和控制器
    //  - Model2 是 MVC 在 Web 上的应用
    //  - 在 Model2 中，控制器实现成 Servlet，而 Jsp/HTML 实现视图
}
