package com.company.designprinciple.CRP;

/**
 * 组合复用原则
 *
 * @author 郁农欣 部门：电商事业部
 * @version V1.0
 * @copyright Copyright 2014-2019 Chinalife-clec All Right Reserved
 * @date 2019-10-12
 * @modified_date 2019-10-12
 */
public class CRPTest {
    public static void main(String[] args) {
        //红色汽油汽车
        GasolineCar gasolineCar1 = new GasolineCar(new Red());
        //白色电动汽车
        ElectricCar electricCar1 = new ElectricCar(new White());
        gasolineCar1.move();
        electricCar1.move();
    }
}

// Color
interface Color {
    String getColor();
}

// Red
class Red implements Color {
    private static String color = "Red";

    @Override
    public String getColor() {
        return color;
    }
}

//White
class White implements Color {
    private static String color = "White";

    @Override
    public String getColor() {
        return color;
    }
}

//Black
class Black implements Color {
    private static String color = "Black";

    @Override
    public String getColor() {
        return color;
    }
}

// Car
abstract class Car implements Color {
    protected Color color;

    Car(Color color){
        this.color = color;
    }

    public void move() {

    }
}

// GasolineCar
class GasolineCar extends Car {

    GasolineCar(Color color) {
        super(color);
    }

    @Override
    public void move() {
        System.out.println("This "+getColor()+" car "+"use Gasoline");
    }

    @Override
    public String getColor() {
        return color.getColor();
    }
}

// ElectricCar
class ElectricCar extends Car {

    ElectricCar(Color color) {
        super(color);
    }

    @Override
    public void move() {
        System.out.println("This "+getColor()+" car "+"use Electric");
    }

    @Override
    public String getColor() {
        return color.getColor();
    }
}
