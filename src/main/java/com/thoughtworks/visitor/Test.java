package com.thoughtworks.visitor;

/**
 * CEO关注工程师的 KPI，经理的 KPI 和新产品数量
 * CTO关注工程师的代码量、经理的新产品数量；
 */
public class Test {

    public static void main(String[] args) {
        // 构建报表
        BusinessReport report = new BusinessReport();
        System.out.println("=========== CEO看报表 ===========");
        report.showReport(new CEOVisitor());
        System.out.println("=========== CTO看报表 ===========");
        report.showReport(new CTOVisitor());
    }
}