package com.example.async;

/**
 * 异步回调，服务端接收到数据时立刻返回消息通知客户端，同时处理数据
 * 在处理完数据后再调用另一个回调函数通知客户端数据处理结果。
 *
 * @author ynx
 * @version V1.0
 * @date 2019-10-16
 * @modified_date 2019-10-16
 */
public class CallBackTest {

    public static void main(String[] args) {
        Server server = new Server();
        Client client = new Client(server);

        client.sendMsg("a lot of data");
    }
}
