package com.thoughtworks.factory.simplefactory;

public class Test {

    public static void main(String[] args) {
        MaskFactory factory = new MaskFactory();
        IMask maskA = factory.createMask("高端口罩");
        IMask maskB = factory.createMask("低端口罩");
        maskA.show();
        maskB.show();
    }
}