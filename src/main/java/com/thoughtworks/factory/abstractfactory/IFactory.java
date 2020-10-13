package com.thoughtworks.factory.abstractfactory;

public interface IFactory {
    //创建口罩
    IMask createMask();

    //创建防护服
    IProtectiveSuit createSuit();
}