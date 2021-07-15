package com.example.my.learning.serialize;

import com.example.my.learning.singleton.HungrySingleton;

import java.io.*;

/**
 * @author MaYong
 * @date 2021/7/11 18:26
 */
public class SerializeTest {

    /**
     * 单例的序列化和反序列化
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //序列化
        HungrySingleton instance = HungrySingleton.getInstance();
        System.out.println(instance);
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("instance"));
        outputStream.writeObject(instance);
        outputStream.close();

        //反序列化 不是同一个实例了

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("instance"));
        HungrySingleton hungrySingleton = (HungrySingleton)objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(hungrySingleton);
    }
}
