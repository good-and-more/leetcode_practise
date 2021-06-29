package com.atguigu.singleton;

/**
 * 最简单的单例模式,线程不安全,懒汉模式
 */
public class Singleton1 {
    private Singleton1() {
        //1.单例模式必须私有化构造方法,才能避免其他方式创建对象
    }

    private static Singleton1 singleton;

    public static Singleton1 getInstance() {
        //标准单例,判断是否存在singleton,不存在才创建
        if (singleton == null) {
            singleton = new Singleton1();
        }
        return singleton;
    }
}
