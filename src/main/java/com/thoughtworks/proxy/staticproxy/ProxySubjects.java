package com.thoughtworks.proxy.staticproxy;


public class ProxySubjects extends Subjects {

    private Subjects real = new RealSubjects();

    public void operate() {
        // 调用目标之前可以做相关操作
        System.out.println("before....");
        real.operate();
        // 调用目标之后可以做相关操作
        System.out.println("after....");
    }

}