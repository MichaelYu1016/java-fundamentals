package com.company.designpattern.bridge;

/**
 * Shape的具体实现
 * @author ynx
 * @version V1.0
 * @date 2019-12-15
 * @modified_date 2019-12-15
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius,x,y);
    }
}
