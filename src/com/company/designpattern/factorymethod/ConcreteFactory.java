package com.company.designpattern.factorymethod;

import com.company.designpattern.simplefactory.ConcreteProduct;
import com.company.designpattern.simplefactory.Product;

/**
 * @author 郁农欣 部门：电商事业部
 * @version V1.0
 * @copyright Copyright 2014-2019 Chinalife-clec All Right Reserved
 * @date 2019-10-11
 * @modified_date 2019-10-11
 */
public class ConcreteFactory extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
