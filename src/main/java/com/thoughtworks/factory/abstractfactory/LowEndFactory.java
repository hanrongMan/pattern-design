package com.thoughtworks.factory.abstractfactory;

public class LowEndFactory implements IFactory {
    public IMask createMask() {
        IMask mask = new LowEndMask();
        // .....
        //  LowEndMask的100行初始化代码
        return mask;
    }

    public IProtectiveSuit createSuit() {
        IProtectiveSuit suit = new LowEndProtectiveSuit();
        // .....
        //  LowEndProtectiveSuit的100行初始化代码
        return suit;
    }
}
