package com.example.my.learning.thread;

import java.util.concurrent.*;

/**
 * @author MaYong
 * @date 2021/7/12 21:37
 */
public class ThreadTest {

    public static void main(String[] args) {


    }

    //创建线程
    public void newThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程的方法");
            }
        }).start();
    }

    //线程池工具类创建线程，避免线程之间的切换
    public void newExecutors() {

        //不推荐使用
        ExecutorService executorService = Executors.newCachedThreadPool(); //当有多少个任务就会创建多少个的线程，特别消耗CPU性能，容易卡死
        ExecutorService executorService1 = Executors.newFixedThreadPool(10);//使用的时无界队列，会导致OOM
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();//使用的时无界队列，会导致OOM

        //三种方法的底层底层都是ThreadPoolExecutor
        /**
         * int corePoolSize, 指定了线程池中的线程数量，它的数量决定了添加的任务是开辟新的线程去执行，还是放到workQueue任务队列中去
         *
         * int maximumPoolSize, 指定了线程池中的最大线程数量，这个参数会根据你使用的workQueue任务队列的类型，决定线程池会开辟的最大线程数量
         *
         * long keepAliveTime, 当线程池中空闲线程数量超过corePoolSize时，多余的线程会在多长时间内被销毁
         *
         * TimeUnit unit, keepAliveTime的单位
         *
         * BlockingQueue<Runnable> workQueue, 任务队列，被添加到线程池中，但尚未被执行的任务；它一般分为直接提交队列、有界任务队列、无界任务队列、优先任务队列几种
         *      1.直接提交队列: 设置为SynchronousQueue队列，SynchronousQueue是一个特殊的BlockingQueue，
         *      它没有容量，没执行一个插入操作就会阻塞，需要再执行一个删除操作才会被唤醒，反之每一个删除操作也都要等待对应的插入操作
         *      2.有界的任务队列：有界的任务队列可以使用ArrayBlockingQueue实现,
         *          若有新的任务需要执行时，线程池会创建新的线程，
         *          直到创建的线程数量达到corePoolSize时，则会将新的任务加入到等待队列中。若等待队列已满，即超过ArrayBlockingQueue初始化的容量，
         *          则继续创建线程，直到线程数量达到maximumPoolSize设置的最大线程数量，若大于maximumPoolSize，则执行拒绝策略
         *
         *      3.无界的任务队列：有界任务队列可以使用LinkedBlockingQueue实现
         *          线程池的任务队列可以无限制的添加新的任务，而线程池创建的最大线程数量就是你corePoolSize设置的数量，也就是说在这种情况下maximumPoolSize这个参数是无效的，
         *          哪怕你的任务队列中缓存了很多未执行的任务，当线程池的线程数达到corePoolSize后，就不会再增加了；
         *          若后续有新的任务加入，则直接进入队列等待，当使用这种任务队列模式时，一定要注意你任务提交与处理之间的协调与控制，
         *          不然会出现队列中的任务由于无法及时处理导致一直增长，直到最后资源耗尽的问题
         *      4、优先任务队列：优先任务队列通过PriorityBlockingQueue实现
         *              PriorityBlockingQueue它其实是一个特殊的无界队列，它其中无论添加了多少个任务，
         *              线程池创建的线程数也不会超过corePoolSize的数量，只不过其他队列一般是按照先进先出的规则处理任务，
         *              而PriorityBlockingQueue队列可以自定义规则根据任务的优先级顺序先后执行
         *
         * ThreadFactory threadFactory,线程工厂，用于创建线程，一般用默认即可
         *
         * RejectedExecutionHandler handler 拒绝策略；当任务太多来不及处理时，如何拒绝任务
         *      1、AbortPolicy策略：该策略会直接抛出异常，阻止系统正常工作 ,默认策略
         *      2、CallerRunsPolicy策略：如果线程池的线程数量达到上限，该策略会把任务队列中的任务放在调用者线程当中运行
         *      3、DiscardOledestPolicy策略：该策略会丢弃任务队列中最老的一个任务，也就是当前任务队列中最先被添加进去的，马上要被执行的那个任务，并尝试再次提交；
         *      4、DiscardPolicy策略：该策略会默默丢弃无法处理的任务，不予任何处理。当然使用此策略，业务场景中需允许任务的丢失；
         *
         *
         * 提交优先级: 核心线程 -> 任务队列 -> 非核心线程 -> 拒绝策略   execute()
         * 执行优先级  非核心线程 -> 任务队列  runWorker()
         */
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 20, 60,
                TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(100));

    }


}
