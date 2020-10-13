package com.thoughtworks.bridge.implement2;

class Laptop extends Computer {

    public Laptop(Brand brand) {
        super(brand);
    }

    public void info() {
        super.info();
        System.out.println("笔记本电脑");
    }
}
