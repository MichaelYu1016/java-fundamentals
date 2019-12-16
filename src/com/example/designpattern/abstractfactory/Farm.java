package com.example.designpattern.abstractfactory;

/**
 * 抽象工厂：农场类
 *
 * @author ynx
 * @version V1.0
 * @date 2019-10-14
 * @modified_date 2019-10-14
 */
public interface Farm {
    public Animal newAnimal();
    public Plant newPlant();
}
