package com.example.designpattern.abstractfactory;

/**
 * 具体产品：牛
 *
 * @author ynx
 * @version V1.0
 * @date 2019-10-14
 * @modified_date 2019-10-14
 */
public class Cattle implements Animal {
    @Override
    public void show() {
        System.out.println("This is a Cattle");
    }
}
