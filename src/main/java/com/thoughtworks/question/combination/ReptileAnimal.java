package com.thoughtworks.question.combination;

/**
 * 爬行动物
 * 组合
 */
public class ReptileAnimal {

    private Animal animal;

    public ReptileAnimal(Animal animal) {
        this.animal = animal;
    }

    public void crawling() {
        System.out.println("爬行...");
    }

    public void eat() {
        animal.eat();
    }

}