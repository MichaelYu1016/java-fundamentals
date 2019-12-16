package com.example.async;

/**
 * 模拟客户端
 *
 * @author ynx
 * @version V1.0
 * @date 2019-10-16
 * @modified_date 2019-10-16
 */
public class Client implements CallBack {
    private Server server;

    public Client(Server server) {
        this.server = server;
    }

    public void sendMsg(final String msg) {
        System.out.println("[客户端] 发送消息:"+ msg);

        new Thread(new Runnable() {
            @Override
            public void run() {
                server.getClientMsg(Client.this,msg);
            }
        }).start();
        System.out.println("[客户端] 数据发送成功");
    }

    @Override
    public void report(String message) {
        System.out.println("[客户端] 服务端回调消息:"+ message);
    }

    @Override
    public void process(String message) {
        System.out.println("[客户端] 服务端回调状态:" + message);
    }
}
