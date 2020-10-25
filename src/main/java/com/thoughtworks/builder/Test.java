package com.thoughtworks.builder;

/**
 * demo说明：
 *
 * 以生产PC为例，这里我们假设生产一台PC只需三个步骤，创建cpu、创建内存、创建显示器，将三个步骤抽象成一个Builder，且该Builder有一个创建待加工的产品的方法和返回成品的方法；
 *
 * 以联想电脑和惠普电脑为例，认为它们在生产电脑的过程中，以上三个步骤的实现是不一致的，对应着具体的HPBuilder和LenovoBuilder；
 *
 * 同时，我们把电脑产品封装成Computer类，其拥有cpu、内存、显示器三个属性；
 *
 * 然后，再创建一个指挥者类Director，其拥有一个建造者对象和建造PC产品的方法construct，该方法通过具体建造者对象，依次执行每个步骤，最后返回建造完成的产品对象；
 */
public class Test {
    public static void main(String[] args) {
        Builder hpBuilder = new HPBuilder();
        Director director = new Director(hpBuilder);
        Computer hpPC = director.construct();
        System.out.println(hpPC.toString());
        
        Builder lenovoBuilder = new LenovoBuilder();
        director.setBuilder(lenovoBuilder);
        Computer lenovoPC = director.construct();
        System.out.println(lenovoPC.toString());
        
    }
}