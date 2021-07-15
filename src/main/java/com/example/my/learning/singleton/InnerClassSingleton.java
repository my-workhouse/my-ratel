package com.example.my.learning.singleton;

/**
 * @author MaYong
 * @date 2021/7/11 15:45
 */
public class InnerClassSingleton {

    /**
     * 通过反射可能会造成单例的破坏，可以在构造方法中抛出异常
     */

    static class InnerClass{
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance(){
        //懒加载实现
        return InnerClass.instance;
    }

    private InnerClassSingleton(){
        if(InnerClass.instance != null){
            throw new RuntimeException("单例类，不允许初始胡多个实例");
        }
    }
}
