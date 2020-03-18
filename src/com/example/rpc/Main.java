package com.example.rpc;

/**
 * @author ynx
 * @version V1.0
 * @date 2020-03-18
 * @modified_date 2020-03-18
 */
public class Main {
    public static void main(String args[]){
        HelloService helloService = new HelloServiceImpl();

        RPCServer server = new RPCServer();
        server.register(helloService, 50001);
    }
}
