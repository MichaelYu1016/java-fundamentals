package com.company.async;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 * @author ynx
 * @version V1.0
 * @date 2019-10-16
 * @modified_date 2019-10-16
 */
public class CallBackTest {
    // TODO: 完善异步回调
    public static void main(String[] args) {
        //批量异步
        ExecutorService executor = Executors.newFixedThreadPool(1000);
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
            }, executor);
            future.thenAccept(uuid -> System.out.println("线程" + uuid + "结束了"));
        }
        //关闭线程池
        executor.shutdown();
        try {
            if (executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS)) {
                System.out.println("所有任务已经执行完毕");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
