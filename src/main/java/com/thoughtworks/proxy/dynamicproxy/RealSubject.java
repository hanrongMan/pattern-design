package com.thoughtworks.proxy.dynamicproxy;

public class RealSubject implements ISubject {


    public void doAction(String action) {
        System.out.println("I am RealSubject, do action "+ action);
    }

}