package com.example.designpattern.bridge;

/**
 * 桥接模式
 * @author ynx
 * @version V1.0
 * @date 2019-12-15
 * @modified_date 2019-12-15
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(50,50, 5, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
