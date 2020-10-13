package com.thoughtworks.factory.factory;

public class Test {

    public static void main(String[] args) {
        IMaskFactory factoryA = new LowEndFactory();
        IMaskFactory factoryB = new HighEndFactory();
        IMask maskA = factoryA.createMask();
        IMask maskB = factoryB.createMask();
        maskA.show();
        maskB.show();
    }
}