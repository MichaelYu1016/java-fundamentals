package com.company.designpattern.factorymethod;

import com.company.designpattern.simplefactory.ConcreteProduct2;
import com.company.designpattern.simplefactory.Product;

/**
 * @author ynx
 * @version V1.0
 * @copyright ynx
 * @date 2019-10-11
 * @modified_date 2019-10-11
 */
public class ConcreteFactory2 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
