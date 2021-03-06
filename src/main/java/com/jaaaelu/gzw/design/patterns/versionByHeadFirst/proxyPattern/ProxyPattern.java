package com.jaaaelu.gzw.design.patterns.versionByHeadFirst.proxyPattern;

public class ProxyPattern {
    //  第十一章 代理模式

    //  代理模式要做的就是控制和管理访问

    //  代理模式：为另一个对象提供一个提升或占位符以控制对这个对象的方法
    //  使用代理模式创建对象，让代表对象控制某对象的访问，被代理的对象可以是远程的对象、创建开销大的对象或是需要安全控制
    //  的对象
    //  - 远程代理控制访问远程对象
    //  - 虚拟代理控制访问创建开销大的资源
    //  - 保护代理基于权限控制对资源的访问

    //  类图解析：
    //  首先是 Subject，它为 RealSubject 和 Proxy 提供了接口。通过实现同一接口，Proxy 在 RealSubject 出现的地方取代它
    //  RealSubject 是真正做事的对象，它是被 Proxy 代理和控制访问的对象
    //  Proxy 持有 RealSubject 的引用，在某些例子中，Proxy 还会负责 RealSubject 对象的创建和销毁。客户和 RealSubject 的交
    //  互都必须通过 Proxy。因为 Proxy 和 RealSubject 实现相同的接口，所以任何用到 RealSubject 的地方，都可以用 Proxy 取
    //  代。Proxy 也控制了对 RealSubject 的访问，在某些情况下，我们可能也需要这样的控制。这些情况包括 RealSubject 是远程
    //  的对象，RealSubject 是创建开销大，或 RealSubject 需要被保护

    //  远程代理
    //  远程代理可以作为另一个 JVM 上对象的本地代表。调用代理的方法，会被代理利用网络转发到远程执行，并且结果通过我网络返
    //  回给代理，再由代理将结果转给客户

    //  虚拟代理（比如网络请求中的图片占位图）
    //  虚拟代理作为创建开销大的对象的代表。虚拟代理经常自动我们真正需要一个对象的时候才创建它。当对象在创建前和创建中时，
    //  由虚拟代理来扮演对象的替身。对象创建后，代理就会将请求直接委托给对象

    //  有时候装饰者模式和代理模式这两者的确看起来很像，但它们的目的是不一样的。装饰者为对象增加行为，而代理是控制对象的访问

    //  代理和适配器都是挡在其他对象前面，并负责将请求转发给它们。适配器会改变对象适配的接口，而代理则实现相同的接口

    //  保护代理
    //  Java 的反射包中有自己的代理支持，利用这个包你可以在运行时动态地创建一个代理类，实现一个或多个接口，并将方法的调用
    //  转发到你所指定的类。因为实际的代理类在运行是创建，我们称这个 Java 技术为：动态代理

    //  什么是 InvocationHandler，作者认为可以理解为，当代理的方法被调用时，代理就会把这个调用转发给 InvocationHandler，
    //  但这个并不是通过调用 InvocationHandler 的相应方法做到的

    //  InvocationHandler 并没有实现代理类的任何方法，因为它本身不是 Proxy，它只是一个帮助 Proxy 的类，Proxy 会把调用转发
    //  给它处理。Proxy 本身是利用静态的 Proxy.newProxyInstance() 方法在运行时动态创建的

    //  到底什么是动态代理？动态代理之所以被称为动态，是因为运行时才将它的类创建出来。代码开始执行时，还没有 Proxy 类，它
    //  是根据需要从你传入的接口集创建的

    //  如何判断一个类是否为动态代理类？如果是的话，调用 isProxyClass() 时此方法会返回 true，表示这是一个动态代理类

    //  连连看总结（书中的连连看）：
    //  - 装饰者：包装另一个对象，并提供额外的行为
    //  - 外观：包装许多对象以简化他们的接口
    //  - 代理：包装另一个对象，并控制对它的访问
    //  - 适配器：包装另一个对象，并提供不同的接口

    //  要点：
    //  - 代码模式为另一个对象提供代表，以便控制客户对对象的访问，管理访问的方式有许多种
    //  - 远程代理管理客户和远程对象之间的交互
    //  - 虚拟代理控制访问实例化开销大的对象
    //  - 保护代理基于调用者控制对对象方法的访问
    //  - 代理模式有需要变体，例如：缓存代理、同步代理、防火墙代理与写入时复制代理
    //  - 代理在结构上类似装饰者，但目的不同
    //  - 装饰者模式为对象加上行为，而代理则是控制访问
    //  - Java 内置的代理支持，可以根据需要建立动态代理，并将所有调用分配到所选的处理器中
    //  - 就和其他包装着一样，代理会增加你的设计中类的数目增加
}
