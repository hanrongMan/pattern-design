package com.thoughtworks.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String rule = "key1 > 100 && key2 < 30 || key3 < 100";
        AlertRuleInterpreter interpreter = new AlertRuleInterpreter(rule);
        Map stats = new HashMap<>();
        stats.put("key1", 101l);
        stats.put("key2", 121l);
        stats.put("key3", 88l);
        boolean alert = interpreter.interpret(stats);
        System.out.println(alert);

        System.out.println(false && true || true);
    }

}