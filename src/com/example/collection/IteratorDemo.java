package com.example.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Collection集合中的方法，子集合都可以用
 * Iterator<E> iterator()迭代器，集合的专用方式子集合都可以用
 * Object next()获取当前元素，并移动到下一个位置
 * boolean hasNext()判断此位置是否有元素
 * <p>
 * List集合中的方法
 * void add(int index,Object element)在指定位置添加元素（原索引处的元素后延）
 * Object get(int index)获取指定位置的元素
 * list迭代器中的特有方法
 * Object previous ()返回此处位置的前一个的元素，并移动到前一个位置。
 * boolean hasPrevious()判断此处的前一个位置是否有元素
 *
 * @author ynx
 * @version V1.0
 * @date 2020-01-03
 * @modified_date 2020-01-03
 */
public class IteratorDemo {
    public static void main(String[] args) {

        //Collection集合的遍历
        Collection<String> c = new ArrayList<>();
        c.add("first");
        c.add("second");
        c.add("third");

        Iterator<String> i = c.iterator();

        while (i.hasNext()) {
            //向下转型
            String s = i.next();
            System.out.println(s);
        }
        System.out.println("-----------------");
        //List集合的遍历
        List<String> l = new ArrayList<>();

        l.add(0, "first");
        l.add(1, "second");
        l.add(1, "third");

        ListIterator<String> li = l.listIterator();

        //后向遍历
        while (li.hasNext()) {
            String s = li.next();
            System.out.println(s);
        }
        System.out.println("-----------------");

        //前向遍历
        while (li.hasPrevious()) {
            String s = (String) li.previous();
            System.out.println(s);
        }
        System.out.println("-----------------");

        //get方法遍历
        for (int x = 0; x < l.size(); x++) {
            String s = l.get(x);
            System.out.println(s);

        }
    }
}
