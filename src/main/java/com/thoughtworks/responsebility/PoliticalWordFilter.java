package com.thoughtworks.responsebility;

public class PoliticalWordFilter implements SensitiveWordFilter {
  @Override
  public boolean doFilter(String content) {
    return content.equals("TW问题");
  }
}
