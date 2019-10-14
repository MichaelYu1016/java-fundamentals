package com.company.designpattern.abstractfactory;

/**
 * 抽象工厂
 *
 * @author ynx
 * @version V1.0
 * @date 2019-10-14
 * @modified_date 2019-10-14
 */
public class Client {
    public static void main(String[] args) {
        Farm Beijing = new BeijingFarm();
        Farm Shanghai = new ShanghaiFarm();
        //Beijing 养牛种菜
        Animal cattle = Beijing.newAnimal();
        cattle.show();
        Plant vegetables = Beijing.newPlant();
        vegetables.show();
        //Shanghai 养马种水果
        Animal horse = Shanghai.newAnimal();
        horse.show();
        Plant fruit = Shanghai.newPlant();
        fruit.show();
    }
}
