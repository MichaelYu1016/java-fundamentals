package com.example.designpattern.proxy;

/**
 * @author ynx
 * @version V1.0
 * @date 2019-12-13
 * @modified_date 2019-12-13
 */
public class ProxyTest {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }
}

/**
 * 抽象主题
 */
interface Subject {
    /**
     * 接口方法
     */
    void request();
}

/**
 * 真实主题
 */
class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("访问真实主题方法...");
    }
}

/**
 * 代理
 */
class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    public void preRequest() {
        System.out.println("访问真实主题之前的预处理。");
    }

    public void postRequest() {
        System.out.println("访问真实主题之后的后续处理。");
    }
}
