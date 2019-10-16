package com.company.async;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 异步编程
 *
 * @author ynx
 * @version V1.0
 * @date 2019-10-15
 * @modified_date 2019-10-16
 */
public class AsyncTest {

    public static void main(String[] args) {
        //设置线程池
        ExecutorService executor = Executors.newFixedThreadPool(2);
        // 使用可缓存线程池，会回收空闲线程（60秒不执行任务）
        //ExecutorService executor = Executors.newCachedThreadPool();
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

        // 关闭线程池（如使用可缓存线程不需要）
        executor.shutdown();

        //批量异步
        ExecutorService executorBatch = Executors.newFixedThreadPool(1000);
        for (int i = 0; i < 10; i++) {
            CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
                String uuid = UUID.randomUUID().toString();
                System.out.println("线程" + uuid + "开始了");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return uuid;
            }, executorBatch);
            future.thenAccept(uuid -> System.out.println("线程" + uuid + "结束了"));
        }
        //关闭线程池
        executorBatch.shutdown();
        try {
            if (executorBatch.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS)) {
                System.out.println("所有任务已经执行完毕");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
