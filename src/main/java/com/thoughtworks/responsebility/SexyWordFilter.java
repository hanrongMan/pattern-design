package com.thoughtworks.responsebility;

public class SexyWordFilter implements SensitiveWordFilter {
  @Override
  public boolean doFilter(String content) {
    return content.equals("小视频");
  }
}
