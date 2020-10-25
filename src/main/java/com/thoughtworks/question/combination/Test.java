package com.thoughtworks.question.combination;

public class Test {


    public static void main(String[] args) {
        Animal animal = new Animal();
        ReptileAnimal reptileAnimal = new ReptileAnimal(animal);
        reptileAnimal.eat();;
        reptileAnimal.crawling();
    }
}
