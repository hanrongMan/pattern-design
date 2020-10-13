package com.thoughtworks.factory.abstractfactory;

public class HighEndFactory implements IFactory {
    public IMask createMask() {
        IMask mask = new HighEndMask();
        // .....
        // HighEndMask的100行初始化代码
        return mask;
    }

    public IProtectiveSuit createSuit() {
        IProtectiveSuit suit = new HighEndProtectiveSuit();
        // .....
        //  HighEndProtectiveSuit的100行初始化代码
        return suit;
    }
}