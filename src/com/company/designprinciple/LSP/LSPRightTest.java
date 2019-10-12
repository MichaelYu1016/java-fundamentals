package com.company.designprinciple.LSP;

/**
 * 里式替换原则-正确示例
 *
 * @author ynx
 * @version V1.0
 * @copyright ynx
 * @date 2019-10-12
 * @modified_date 2019-10-12
 */
public class LSPRightTest {
    public static void main(String[] args)
    {
        Bird1 bird1=new Swallow1();
        Animal bird2=new BrownKiwi1();
        bird1.setSpeed(120);
        bird2.setRunSpeed(120);
        System.out.println("如果飞行300公里：");
        try
        {
            System.out.println("燕子将飞行"+bird1.getFlyTime(300)+"小时.");
            System.out.println("几维鸟将飞行"+bird2.getRunTime(300)+"小时。");
        }
        catch(Exception err)
        {
            System.out.println("发生错误了!");
        }
    }
}
// 动物类
class Animal{
    double runSpeed;

    public void setRunSpeed(double runSpeed) {
        this.runSpeed = runSpeed;
    }

    public double getRunTime(double distance) {
        return (distance/runSpeed);
    }
}
//鸟类-继承自动物类（扩充了飞行速度）
class Bird1 extends Animal
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
//燕子类-继承鸟类
class Swallow1 extends Bird1{}
//几维鸟类-继承动物类
class BrownKiwi1 extends Animal {}
