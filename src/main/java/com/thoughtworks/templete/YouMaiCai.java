package com.thoughtworks.templete;

//炒油麦菜
public class YouMaiCai extends Food {
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是油麦菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("葱，姜，蒜，酱油，香醋。。。");
    }
}


