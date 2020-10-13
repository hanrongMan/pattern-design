package com.thoughtworks.bridge.implement2;

/**
 * 我们从 2 个维度分类，将它们分离独立出来，即将电脑类型和电脑品牌分离出来
 *
 * 当我们在其中一个维度上的代码进行修改时并不是影响到另一个维度的代码，这样遵循了单一职责原则，同时代码结构也变得灵活起来。
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Desktop(new LenovoBrand());
        computer.info();
    }

}