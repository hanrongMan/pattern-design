package com.thoughtworks.adapter.object;

/**
 * 我手中有个HDMI插头的设备，但是主机上只有usb插头的插口，怎么办呢？弄个转换器，将HDMI插头转换成为USB插头就可以使用了。
 *
 * 　　接口HDMI：描述HDMI接口格式
 *
 * 　　接口Usb：描述USB接口格式
 *
 * 　　类Usber：是接口Usb的实现类，是具体的USB接口格式
 *
 * 　　Adapter：用于将HDMI接口格式转换成为USB接口格式
 */
public class Test {
    public static void main(String[] args) {
        HDMI p = new Adapter(new Usber());
        p.isHDMI();
    }
}