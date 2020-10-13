package com.thoughtworks.flyweight.implement2;

/**
 * 这个时候，享元模式就可以派上用场了。像刚刚的实现方式，在内存中会有大量的相似对象。这些相似对象的 id、text、color 都是相同的，
 * 唯独 positionX、positionY 不同。实际上，我们可以将棋子的 id、text、color 属性拆分出来，设计成独立的类，并且作为享元供多个棋盘复用。
 * 这样，棋盘只需要记录每个棋子的位置信息就可以了
 */
public class Test {

}
