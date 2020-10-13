package com.thoughtworks.memento;

import java.util.Stack;

public class MementoHolder {
  private Stack<Memento> mementos = new Stack<>();

  public Memento popSnapshot() {
    return mementos.pop();
  }

  public void pushSnapshot(Memento memento) {
    mementos.push(memento);
  }
}
