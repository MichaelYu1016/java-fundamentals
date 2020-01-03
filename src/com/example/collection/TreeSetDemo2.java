package com.example.collection;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 使用比较器排序
 *
 * @author ynx
 * @version V1.0
 * @date 2020-01-03
 * @modified_date 2020-01-03
 */
public class TreeSetDemo2 {
    public static void main(String[] args) {
        //匿名内部类实现比较器排序接口
        TreeSet<Student> ts=new TreeSet<>(Comparator.comparingInt(Student::getAge).thenComparing(Student::getName));

//        new Comparator<Student>() {
//            //匿名内部类实现比较器排序接口
//            public int compare(Student s1, Student s2) {
//                int num1=s1.getAge()-s2.getAge();
//                int num2=num1==0? s1.getName().compareTo(s2.getName()):num1;
//                return num2;
//            }

        Student s1=new Student("甲",18);
        Student s2=new Student("乙",19);
        Student s3=new Student("丙",20);
        Student s4=new Student("丁",18);
        Student s5=new Student("丙",20);
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
