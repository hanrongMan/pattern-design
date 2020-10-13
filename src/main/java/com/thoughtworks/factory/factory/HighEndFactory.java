package com.thoughtworks.factory.factory;


public class HighEndFactory implements IMaskFactory{

    public IMask createMask() {
        IMask mask =  new HighEndMask();
        // .....
        // HighEndMask的100行初始化代码
        return mask;
    }
}