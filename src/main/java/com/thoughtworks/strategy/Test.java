package com.thoughtworks.strategy;

public class Test {
   public static void main(String[] args) {
      System.out.println("10 + 5 = " + Strategys.executeStrategy(10, 5, "+"));
 
      System.out.println("10 - 5 = " + Strategys.executeStrategy(10, 5, "-"));
 
      System.out.println("10 * 5 = " + Strategys.executeStrategy(10, 5, "*"));
   }
}