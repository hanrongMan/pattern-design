package com.thoughtworks.singleton;

/**
 * 5、枚举
 * JDK 版本：JDK1.5 起
 *
 * 是否 Lazy 初始化：否
 *
 * 是否多线程安全：是
 *
 * 枚举类实现单例模式是 effective java 作者极力推荐的单例实现模式，因为枚举类型是线程安全的，并且只会装载一次
 */
public class Singleton5 {
    public static Singleton5 getInstance(){
        return Singleton.INSTANCE.getInstance();
    }
}