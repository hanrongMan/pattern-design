package com.thoughtworks.bridge.implement2;

class Desktop extends Computer {

    public Desktop(Brand brand) {
        super(brand);
    }


    public void info() {
        super.info();
        System.out.println("台式电脑");

    }


}
