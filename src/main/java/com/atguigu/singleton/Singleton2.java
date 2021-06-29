package com.atguigu.singleton;

public class Singleton2 {
    private Singleton2() {}
    //饿汉模式,类加载时就创建单例对象
    private static Singleton2 singleton2 = new Singleton2();
    //饿汉不需要考虑线程安全问题,因为在加载类的时候就创建了,不会有多线程调用它,java的classLoader机制保证了单例对象唯一
    public static Singleton2 getInstance() {
        return singleton2;
    }
}
