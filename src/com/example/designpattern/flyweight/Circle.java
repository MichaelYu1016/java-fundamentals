package com.example.designpattern.flyweight;

/**
 * 具体享元，颜色属性共享，坐标非共享
 * @author ynx
 * @version V1.0
 * @date 2019-12-16
 * @modified_date 2019-12-16
 */
public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color){
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                +", x : " + x +", y :" + y +", radius :" + radius + "]");
    }
}
