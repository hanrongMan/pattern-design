package com.thoughtworks.adapter.object;

public class Adapter implements HDMI {

    private Usb usb;

    public Adapter(Usb usb) {
        this.usb = usb;
    }

    public void isHDMI() {
        usb.isUsb();
    }

}