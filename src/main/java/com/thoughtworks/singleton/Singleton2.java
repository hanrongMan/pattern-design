package com.thoughtworks.singleton;

/**
 2、懒汉式，线程安全
 是否 Lazy 初始化：是

 是否多线程安全：是
 */
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2 (){}
    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}