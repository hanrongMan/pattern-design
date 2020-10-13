package com.thoughtworks.adapter.clazz;

public class Adapter extends Usber implements HDMI {

    public void isHDMI() {
        super.isUsb();
    }

}