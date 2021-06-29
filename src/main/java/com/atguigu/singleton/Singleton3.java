package com.atguigu.singleton;

/**
 * 加锁懒汉单例,解决了线程安全问题
 * 效率偏低,每次获取实例都进行同步锁,事实上只需要在第一次new对象的时候同步锁就行了,后续想获取实例可以直接返回
 */
public class Singleton3 {
    private Singleton3() {}
    private static Singleton3 singleton3;

    public static synchronized Singleton3 getInstance() {
        if (singleton3 == null) {
            singleton3 = new Singleton3();
        }
        return singleton3;
    }
}
