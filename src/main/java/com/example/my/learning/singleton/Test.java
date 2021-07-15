package com.example.my.learning.singleton;

/**
 * @author MaYong
 * @date 2021/7/11 14:58
 */
public class Test {

    public static void main(String[] args) {
        new Thread(() -> {
            LazySingleton instance = LazySingleton.getInstance();
            System.out.println(instance);
        }).start();

        new Thread(() -> {
            LazySingleton instance = LazySingleton.getInstance();
            System.out.println(instance);
        }).start();
    }
}
