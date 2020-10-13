package com.thoughtworks.factory.abstractfactory;

public class Test {

    public static void main(String[] args) {
        IFactory factoryA = new LowEndFactory();
        IFactory factoryB = new HighEndFactory();
        //创建低端口罩
        IMask maskA = factoryA.createMask();
        //创建高端口罩
        IMask maskB = factoryB.createMask();
        //创建低端防护服
        IProtectiveSuit suitA = factoryA.createSuit();
        //创建高端防护服
        IProtectiveSuit suitB = factoryB.createSuit();

        maskA.showMask();
        maskB.showMask();
        suitA.showSuit();
        suitB.showSuit();
    }
}