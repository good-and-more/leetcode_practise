package com.atguigu.singleton;

/**
 * 天然线程安全,防止反射破解和反序列化创建对象
 */
public enum Singleton5 {
    INSTANCE;
    public void doSomething() {
        System.out.println("这是枚举类型的单例模式");
    }
}
