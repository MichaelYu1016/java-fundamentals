package com.example.collection;

/**
 * @author ynx
 * @version V1.0
 * @date 2020-01-03
 * @modified_date 2020-01-03
 */
public class Student implements Comparable<Student> {

    private int age;

    private String name;

    public Student() {
        super();
    }

    public Student(String name,int age) {
        super();
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {
        //此处的this和s前后位置改变会影响排序方式
        int num1 = this.age - s.age;
        return num1 == 0 ? this.name.compareTo(s.name) : num1;
    }
}
