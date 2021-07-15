package com.example.my.learning.singleton;

/**
 * @author MaYong
 * @date 2021/7/11 14:50
 *
 * 懒汉模式
 * 注意：1.保证线程安全 2.防止指令重排  3.双重检查优化
 */

public class LazySingleton {

    //防止重排序
    private static volatile LazySingleton instance;

    /**
     * 双重检验
     */
    public static LazySingleton getInstance(){
        if(instance == null){
            //模拟多线程
//            try {
//                TimeUnit.SECONDS.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            synchronized (LazySingleton.class){
                if(instance == null){
//                    //模拟多线程
//                    try {
//                        TimeUnit.SECONDS.sleep(1);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }

                    //创建实例的过程不是原子操作
                    instance = new LazySingleton();
                    //1.堆内存分配该对象的内存空间，并返回执行该空间的的内存地址
                    //2.把内存地址赋值给变量
                    //3.初始化内存空间
                }
            }

        }
        return instance; // 可能会获取到未初始化的变量 volatile
    }

    private LazySingleton(){}
}
