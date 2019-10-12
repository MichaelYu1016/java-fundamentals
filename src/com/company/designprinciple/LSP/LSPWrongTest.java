package com.company.designprinciple.LSP;

/**
 * 里式替换原则-错误示例
 *
 * @author 郁农欣 部门：电商事业部
 * @version V1.0
 * @copyright Copyright 2014-2019 Chinalife-clec All Right Reserved
 * @date 2019-10-12
 * @modified_date 2019-10-12
 */
public class LSPWrongTest {
    public static void main(String[] args)
    {
        Bird bird1=new Swallow();
        Bird bird2=new BrownKiwi();
        bird1.setSpeed(120);
        bird2.setSpeed(120);
        System.out.println("如果飞行300公里：");
        try
        {
            System.out.println("燕子将飞行"+bird1.getFlyTime(300)+"小时.");
            System.out.println("几维鸟将飞行"+bird2.getFlyTime(300)+"小时。");
        }
        catch(Exception err)
        {
            System.out.println("发生错误了!");
        }
    }
}
//鸟类
class Bird
{
    double flySpeed;
    public void setSpeed(double speed)
    {
        flySpeed=speed;
    }
    public double getFlyTime(double distance)
    {
        return(distance/flySpeed);
    }
}
//燕子类
class Swallow extends Bird{}
//几维鸟类
class BrownKiwi extends Bird
{
    public void setSpeed(double speed)
    {
        flySpeed=0;
    }
}
