package com.example.async;

import java.util.concurrent.*;

/**
 * 线程池
 *
 * @author ynx
 * @version V1.0
 * @date 2020-01-01
 * @modified_date 2020-01-01
 */
public class ThreadPool {

    public static  void main(String[] args){
        /*
         * 创建一个线程的实例
         * 核心线程大小5
         * 最大线程大小10
         * 线程没有处理任务的时候存活的时间
         * 创建一个数组阻塞队列（队列的长度为5）
         * */
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5,10,8000,
                TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>());
        // 可缓存线程池
//        ThreadPoolExecutor executor = new ThreadPoolExecutor(0,10,8000,
//                TimeUnit.MILLISECONDS, new SynchronousQueue<>());
        for(int i=0;i<15;i++){
            MyTask myTask = new MyTask(executor);
            //两种方法调用将任务加入到阻塞队列中submit(Runnable) 和 excute(Runnable) 方法
            executor.submit(myTask);  //线程执行完毕返回一个future对象
        }
    }


}

class MyTask implements Runnable {

    private ThreadPoolExecutor executor;

    public MyTask(ThreadPoolExecutor ex){
        this.executor=ex;
    }


    @Override
    public void run() {
        synchronized (executor) {  //加锁监视器的目的是应为多个线程修改数据，调用get方法可能获取数不对
            System.out.println("线程-" + Thread.currentThread().getId() + "：正在执行task ");
            try {
                //线程休眠三秒更直观的查看效果
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程池中核心线程数目：" + executor.getPoolSize() + "，队列中等待执行的任务数目：" +
                    executor.getQueue().size() + "，已执行完成的任务数目：" + executor.getCompletedTaskCount());
        }
    }
}
