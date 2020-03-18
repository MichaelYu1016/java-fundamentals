package com.example.rpc;

/**
 * @author ynx
 * @version V1.0
 * @date 2020-03-18
 * @modified_date 2020-03-18
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name){
        return "Hello, " + name;
    }
}
