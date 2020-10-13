package com.thoughtworks.memento;

import java.util.Scanner;


/**
 * 编写一个小程序，可以接收命令行的输入。
 * 用户输入文本时，程序将其追加存储在内存文本中；
 * 用户输入“:list”，程序在命令行中输出内存文本的内容；
 * 用户输入“:undo”，程序会撤销上一次输入的文本，也就是从内存文本中将上次输入的文本删除掉。
 */
public class Test {
  public static void main(String[] args) {
    InputText inputText = new InputText();
    MementoHolder snapshotsHolder = new MementoHolder();
    Scanner scanner = new Scanner(System.in);
    System.out.println("请开始你的表演。。。");
    while (scanner.hasNext()) {
      String input = scanner.next();
      if (input.equals(":list")) {
        System.out.println(inputText.getText());
      } else if (input.equals(":undo")) {
        Memento memento = snapshotsHolder.popSnapshot();
        inputText.restoreSnapshot(memento);
      } else {
        snapshotsHolder.pushSnapshot(inputText.createSnapshot());
        inputText.append(input);
      }
    }
  }
}
