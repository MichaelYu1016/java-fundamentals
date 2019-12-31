package com.example.designpattern.strategy;

/**
 * 环境类
 *
 * @author ynx
 * @version V1.0
 * @date 2019-12-31
 * @modified_date 2019-12-31
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
