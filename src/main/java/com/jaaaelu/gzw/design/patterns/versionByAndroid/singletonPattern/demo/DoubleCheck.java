package com.jaaaelu.gzw.design.patterns.versionByAndroid.singletonPattern.demo;

public class DoubleCheck {
    private volatile static DoubleCheck Instance;

    private DoubleCheck() {
    }

    public static DoubleCheck getInstance() {
        if (Instance == null) {
            synchronized (DoubleCheck.class) {
                if (Instance == null) {
                    //  Instance = new DoubleCheck(); 一句代码，做了三件事：
                    //  1.给 DoubleCheck 的实例对象分配内存
                    //  2.调用 DoubleCheck 的构造函数，初始化成员字段
                    //  3.将 Instance 对象指向分配的内存空间（此时 Instance 就是 null 了）
                    //  但由于 Java 编译器允许处理器乱序执行，所以 2、3 的执行步骤可能无法保证，可能是 1-2-3，也可能是
                    //  1-3-2，如果是 1-3-2，3 执行完了，2 还没执行就切换到另一个线程上面去了，那么这时候 Instance 就不是
                    //  空了，所以，这时候另一个线程取走的 Instance 使用时就会出错，这个时候添加关键字 volatile 就可以解决
                    //  这个问题，保证执行顺序
                    Instance = new DoubleCheck();
                }
            }
        }
        return Instance;
    }
}
