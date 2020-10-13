package com.thoughtworks.proxy.dynamicproxy;

public class Test {
    public static void main(String[] args) {
        ISubject subject = new RealSubject();
        ISubject proxy = new DynamicProxyHandler(subject).getProxy();
        proxy.doAction("play");
    }
}
