package com.company.designpattern.factorymethod;

import com.company.designpattern.simplefactory.Product;

/**
 * @author ynx
 * @version V1.0
 * @copyright ynx
 * @date 2019-10-11
 * @modified_date 2019-10-11
 */
public abstract class Factory {

    abstract public Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();
    }
}
