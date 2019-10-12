package com.company.designpattern.builder;

/**
 * 通过建造者模式添加字符
 *
 * @author 郁农欣 部门：电商事业部
 * @version V1.0
 * @copyright Copyright 2014-2019 Chinalife-clec All Right Reserved
 * @date 2019-10-12
 * @modified_date 2019-10-12
 */
public class Client {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        final int count = 26;
        for (int i = 0; i < count; i++) {
            sb.append((char) ('a' + i));
        }
        System.out.println(sb.toString());
    }
}
