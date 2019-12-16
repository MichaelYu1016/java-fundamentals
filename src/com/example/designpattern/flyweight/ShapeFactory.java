package com.example.designpattern.flyweight;

import java.util.HashMap;

/**
 * 享元工厂
 * @author ynx
 * @version V1.0
 * @date 2019-12-16
 * @modified_date 2019-12-16
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
