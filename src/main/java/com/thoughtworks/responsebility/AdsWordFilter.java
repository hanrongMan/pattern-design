package com.thoughtworks.responsebility;

public class AdsWordFilter implements SensitiveWordFilter {
  @Override
  public boolean doFilter(String content) {
    return content.equals("拼多多");
  }
}
