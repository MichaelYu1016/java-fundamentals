package com.company.async;

/**
 * 模拟服务端
 *
 * @author ynx
 * @version V1.0
 * @date 2019-10-16
 * @modified_date 2019-10-16
 */
public class Server {

    public void getClientMsg(CallBack callBack, String msg) {

        System.out.println("[服务端] 服务端接收到客户端发送的消息为："+ msg);
        //收到数据后通过回调函数立刻通知客户端，让客户端能进行其他操作
        callBack.report("data已接收，开始处理");

        try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        System.out.println("[服务端] 数据处理成功，状态码:200");
        //处理完数据后，通知客户端处理结果,并执行相应操作
        callBack.process("status:200");
    }
}
