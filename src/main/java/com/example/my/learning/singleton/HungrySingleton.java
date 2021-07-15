package com.example.my.learning.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author MaYong
 * @date 2021/7/11 15:35
 * <p>
 * 饿汉模式：在类加载的阶段完成了实例的初始化，通过类加载机制保证线程安全
 * 类加载的阶段：1.加载，加载对应的二进制文件，并且在方法区创建对应的数据结构
 * 2.连接：验证 准备 解析
 * 3.初始化,给静态赋值
 */
public class HungrySingleton implements Serializable {


    private static final long serialVersionUID = 7629237629737938585L;
    private static final HungrySingleton instance = new HungrySingleton(); //优化，可以延迟加载，见静态内部类

    public static HungrySingleton getInstance() {
        return instance;
    }

    private HungrySingleton() {
    }

    /**
     * 单例实例反序列化，为同一个实例
     */
     Object readResolve() throws ObjectStreamException{
        return instance;
     }
}
