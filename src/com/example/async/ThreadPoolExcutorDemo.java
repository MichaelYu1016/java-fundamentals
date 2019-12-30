package com.example.async;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 使用ThreadPoolExcutor创建线程
 *
 * @author ynx
 * @version V1.0
 * @date 2019-12-30
 * @modified_date 2019-12-30
 */
public class ThreadPoolExcutorDemo {
    private static int produceTaskSleepTime = 5;
    private static int consumeTaskSleepTime = 5000;
    private static int produceTaskMaxNumber = 20;

    public static void main(String[] args) {
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(2,4,3, TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(3),
                new ThreadPoolExecutor.DiscardOldestPolicy());

        for (int i = 1; i<=produceTaskMaxNumber;i++){
            try {
                String work = "work@"+i;
                System.out.println("put:"+work);
                threadPool.execute(()-> {
                    System.out.println("start------"+work);
                    try {
                        Thread.sleep(consumeTaskSleepTime);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                });
                Thread.sleep(produceTaskSleepTime);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
