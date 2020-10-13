package com.thoughtworks.bridge.implement1;


/**
 * 上述代码通过继承方式实现了图中的电脑分类结构。但是，使用继承的方式存在几个问题：
 *
 * 1 扩展性问题：如果新增平板电脑分类，需要添加 N 个品牌子类。如果新增索尼品牌，其他电脑分类也需要添加相应子类。
 *
 * 2 违背单一职责原则：新增类型或新增品牌都会导致第 3 级目录结构的变化。
 */
public class Test {
    public static void main(String[] args) {
        LenovoDesktop lenovoDesktop = new LenovoDesktop();
        lenovoDesktop.info();

    }
}
