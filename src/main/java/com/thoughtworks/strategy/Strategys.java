package com.thoughtworks.strategy;

import java.util.HashMap;
import java.util.Map;

public class Strategys {
   private static Map<String, Strategy> strategys = new HashMap<>();

   static {
      strategys.put("+", new OperationAdd());
      strategys.put("-", new OperationSubstract());
      strategys.put("*", new OperationMultiply());
   }

   public static int executeStrategy(int num1, int num2, String operation){
      Strategy strategy = strategys.get(operation);
      return strategy.doOperation(num1, num2);
   }
}