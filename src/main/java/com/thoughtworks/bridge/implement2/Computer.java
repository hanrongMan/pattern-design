package com.thoughtworks.bridge.implement2;

public abstract class Computer {

    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void info() {
        this.brand.info();
    }

}


