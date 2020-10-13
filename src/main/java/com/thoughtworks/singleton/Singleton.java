package com.thoughtworks.singleton;

/**
 * 枚举类型是线程安全的，并且只会装载一次
 */
public enum Singleton {
    INSTANCE;

    private final Singleton5 instance;

    Singleton() {
        instance = new Singleton5();
    }

    public Singleton5 getInstance() {
        return instance;
    }
}