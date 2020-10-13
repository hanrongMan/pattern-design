package com.thoughtworks.factory.factory;


public class LowEndFactory implements IMaskFactory{

    public IMask createMask() {
        IMask mask =  new LowEndMask();
        // .....
        //  LowEndMask的100行初始化代码
        return mask;
    }
}