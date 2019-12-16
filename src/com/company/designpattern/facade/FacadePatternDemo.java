package com.company.designpattern.facade;

/**
 * 外观模式(Facade Pattern)
 * @author ynx
 * @version V1.0
 * @date 2019-12-16
 * @modified_date 2019-12-16
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
