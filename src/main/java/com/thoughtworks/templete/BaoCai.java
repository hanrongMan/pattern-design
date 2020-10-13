package com.thoughtworks.templete;

//炒包菜
public class BaoCai extends Food {
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("蒜，蚝油。。。");
    }
}