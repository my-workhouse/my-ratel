package com.example.my.learning.singleton;

/**
 * @author MaYong
 * @date 2021/7/11 17:33
 */
public enum EnumSingleton {
    INSTANCE;


    public void print(){
        System.out.println(this.hashCode());
    }
}
