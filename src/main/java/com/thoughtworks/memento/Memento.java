package com.thoughtworks.memento;

public class Memento {
  private String text;

  public Memento(String text) {
    this.text = text;
  }

  public String getText() {
    return this.text;
  }
}
