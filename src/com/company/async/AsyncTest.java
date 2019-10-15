package com.company.async;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 异步编程
 *
 * @author ynx
 * @version V1.0
 * @date 2019-10-15
 * @modified_date 2019-10-15
 */
public class AsyncTest {

    public static void main(String[] args) {
        //设置线程池
        ExecutorService executor = Executors.newFixedThreadPool(2);
        // 项目一
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("项目一开始实施");
            try{
                System.out.println("工程师甲正在加紧干活......");
                Thread.sleep(3000);
                return "项目一完成";
            } catch (InterruptedException e) {
                System.err.println("项目一出现故障！");
                return "项目一失败";
            }
        },executor);

        // 项目二
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("项目二开始实施");
            try{
                System.out.println("工程师乙正在加班加点......");
                Thread.sleep(5000);
                return "项目二完成";
            } catch (InterruptedException e) {
                System.err.println("项目二出现故障！");
                return "项目二失败";
            }
        },executor);

        System.out.println("项目实施中：loading......");
        System.out.println("甲方来催了一回");
        System.out.println("项目加速进行：loading......");

        // 项目获取返回值后执行
        future1.thenAccept(System.out::println);
        future2.thenAccept(System.out::println);
    }
}
