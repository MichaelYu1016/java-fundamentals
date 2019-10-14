package com.company.designpattern.abstractfactory;

/**
 * 具体产品：蔬菜
 *
 * @author ynx
 * @version V1.0
 * @date 2019-10-14
 * @modified_date 2019-10-14
 */
public class Vegetables implements Plant {
    @Override
    public void show() {
        System.out.println("some vegetables");
    }
}
