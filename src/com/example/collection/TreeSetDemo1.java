package com.example.collection;

import java.util.TreeSet;

/**
 * TreeSet类存储对象，自然排序
 * 规定:按照年龄进行排序
 *
 * @author ynx
 * @version V1.0
 * @date 2020-01-03
 * @modified_date 2020-01-03
 */
public class TreeSetDemo1 {
    public static void main(String[] args) {

        TreeSet<Student> ts=new TreeSet<>();

        Student s1=new Student("甲",21);
        Student s2=new Student("乙",20);
        Student s3=new Student("丙",18);
        Student s4=new Student("丁",19);
        Student s5=new Student("丙",18);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        for (Student s:ts) {
            System.out.println(s.getName()+s.getAge());
        }
    }
}
