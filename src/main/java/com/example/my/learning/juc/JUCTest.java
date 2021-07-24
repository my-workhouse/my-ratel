package com.example.my.learning.juc;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author MaYong
 * @date 2021/7/20 22:06
 */
public class JUCTest {
    public static void main(String[] args) {

        //打印对象信息
        Object o = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
        synchronized (o){
            System.out.println(ClassLayout.parseInstance(o).toPrintable());
        }
    }
}
