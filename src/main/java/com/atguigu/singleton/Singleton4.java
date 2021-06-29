package com.atguigu.singleton;

/**
 * 懒汉模式,加上双重校验 加锁 volatile防止指令重排
 */
public class Singleton4 {
    private Singleton4() {}
    private static volatile Singleton4 singleton4;

    public static synchronized Singleton4 getInstance() {
        if (singleton4 == null) {//线程A和线程B同时看到singleton = null，如果不为null，则直接返回singleton
            synchronized(Singleton4.class) {//线程A或线程B获得该锁进行初始化
                if (singleton4 == null) {//其中一个线程进入该分支，另外一个线程则不会进入该分支
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }
}
