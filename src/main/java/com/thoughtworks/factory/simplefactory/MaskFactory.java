package com.thoughtworks.factory.simplefactory;

public class MaskFactory {

    public IMask createMask(String type) {
        IMask mask = null;
        if("高端口罩".equals(type)){
            mask = new HighEndMask();
            // .....
            // HighEndMask的100行初始化代码
        }else if("低端口罩".equals(type)){
            mask =  new LowEndMask();
            // .....
            // LowEndMask的100行初始化代码
        }
        return mask;
    }
}