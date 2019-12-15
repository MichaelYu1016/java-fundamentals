package com.company.designpattern.bridge;

/**
 * 调用画图的类
 * @author ynx
 * @version V1.0
 * @date 2019-12-15
 * @modified_date 2019-12-15
 */
public abstract class Shape {
    protected DrawApi drawApi;
    protected Shape(DrawApi drawAPI){
        this.drawApi = drawAPI;
    }
    public abstract void draw();
}
