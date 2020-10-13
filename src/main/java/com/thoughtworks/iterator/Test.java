package com.thoughtworks.iterator;

public class Test {

    public static void main(String[] args) {
        String names[] = {"Robert", "John", "Julie", "Lora"};
        NameCollection nameCollection = new NameCollection(names);
        Iterator iter = nameCollection.getIterator();
        while (iter.hasNext()) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}