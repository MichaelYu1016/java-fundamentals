package com.company.designpattern.facade;

/**
 * @author ynx
 * @version V1.0
 * @date 2019-12-16
 * @modified_date 2019-12-16
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
