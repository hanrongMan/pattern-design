package com.thoughtworks.singleton;

/**
 * 1、懒汉式，线程不安全
 * 是否 Lazy 初始化：是
 *
 * 是否多线程安全：否
 *
 * 优点
 * 实现了懒加载，节约了内存空间
 * 缺点
 * 在不加锁的情况下，线程不安全，可能出现多份实例
 * 在加锁的情况下，会使程序串行化，使系统有严重的性能问题
 */
public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1(){}
  
    public static Singleton1 getInstance() {
    if (instance == null) {  
        instance = new Singleton1();
    }  
    return instance;  
    }  
}