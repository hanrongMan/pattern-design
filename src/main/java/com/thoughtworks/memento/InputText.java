package com.thoughtworks.memento;

public class InputText {
  private StringBuilder text = new StringBuilder();

  public String getText() {
    return text.toString();
  }

  public void append(String input) {
    text.append(input);
  }

  public Memento createSnapshot() {
    return new Memento(text.toString());
  }

  public void restoreSnapshot(Memento memento) {
    this.text.replace(0, this.text.length(), memento.getText());
  }
}

