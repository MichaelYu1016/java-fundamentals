package com.company.designpattern.bridge;

/**
 * 画图的具体实现-绿色圆
 * @author ynx
 * @version V1.0
 * @date 2019-12-15
 * @modified_date 2019-12-15
 */
public class GreenCircle implements DrawApi{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", y: "+ y +"]");
    }
}
