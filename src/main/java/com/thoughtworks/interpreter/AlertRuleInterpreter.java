package com.thoughtworks.interpreter;

import java.util.Map;

public class AlertRuleInterpreter {
  private Expression expression;

  public AlertRuleInterpreter(String ruleExpression) {
    this.expression = new AndExpression(ruleExpression);
  }

  public boolean interpret(Map<String, Long> stats) {
    return expression.interpret(stats);
  }
}
