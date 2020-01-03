package com.example.collection;

import java.util.HashSet;
import java.util.Random;

/**
 * 使用HashSet类随机产生10个不重复的1到20的不重复随机数
 *
 * @author ynx
 * @version V1.0
 * @date 2020-01-03
 * @modified_date 2020-01-03
 */
public class HashSetDemo {
    public static void main(String[] args) {
        Random r=new Random();

        HashSet<Integer> hs=new HashSet<>();

        while(hs.size()<10) {
            hs.add((r.nextInt(20)+1));
        }
        for(Integer i:hs) {
            System.out.println(i);
        }
    }
}
