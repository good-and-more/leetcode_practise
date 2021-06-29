package com.atguigu.singleton;

import org.junit.jupiter.api.Test;

public class TestSingleton {

    /**
     * 测试最简单的单例,线程不安全,懒汉模式
     */
    @Test
    void test1() {
        Singleton1 singleton1 = Singleton1.getInstance();
        System.out.println(singleton1);
        Singleton1 singleton2 = Singleton1.getInstance();
        System.out.println(singleton2);
        System.out.println(singleton1 == singleton2);
    }

    /**
     * 测试单例,饿汉模式
     */
    @Test
    void test2() {
        Singleton2 singleton1 = Singleton2.getInstance();
        System.out.println(singleton1);
        Singleton2 singleton2 = Singleton2.getInstance();
        System.out.println(singleton2);
        System.out.println(singleton1 == singleton2);
    }

    /**
     * 测试单例模式,线程不安全,饿汉模式
     */
    @Test
    void test3() {
        Singleton3 singleton1 = Singleton3.getInstance();
        System.out.println(singleton1);
        Singleton3 singleton2 = Singleton3.getInstance();
        System.out.println(singleton2);
        System.out.println(singleton1 == singleton2);
    }

    /**
     * 测试单例模式,线程安全 DCL volatile
     */
    @Test
    void test4() {
        Singleton4 singleton1 = Singleton4.getInstance();
        System.out.println(singleton1);
        Singleton4 singleton2 = Singleton4.getInstance();
        System.out.println(singleton2);
        System.out.println(singleton1 == singleton2);
    }

}
