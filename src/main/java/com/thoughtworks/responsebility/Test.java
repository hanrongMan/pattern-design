package com.thoughtworks.responsebility;

public class Test {
    public static void main(String[] args) {
        SensitiveWordFilterChain filterChain = new SensitiveWordFilterChain();
        filterChain.addFilter(new AdsWordFilter());
        filterChain.addFilter(new SexyWordFilter());
        filterChain.addFilter(new PoliticalWordFilter());

        boolean legal = filterChain.filter("小视频");
        if (!legal) {
            // 不发表
            System.out.println("包含敏感词汇，不能发表");
        } else {
            // 发表
            System.out.println("发表成功");
        }
    }
}
