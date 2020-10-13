package com.thoughtworks.singleton;

/**
 * 3、饿汉式
 * 是否 Lazy 初始化：否
 *
 * 是否多线程安全：是
 *
 *
 * 优点
 *
 * 由于使用了static关键字，保证了在引用这个变量时，关于这个变量的所以写入操作都完成，所以保证了JVM层面的线程安全
 *
 * 缺点
 *
 * 不能实现懒加载，造成空间浪费，如果一个类比较大，我们在初始化的时就加载了这个类，但是我们长时间没有使用这个类，这就导致了内存空间的浪费。
 *
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();
    private Singleton3 (){}
    public static Singleton3 getInstance() {
        return instance;
    }
}