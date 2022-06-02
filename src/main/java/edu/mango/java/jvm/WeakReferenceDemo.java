package edu.mango.java.jvm;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * @author mango
 * @version 1.0
 * @description TODO
 * @email
 * @date 2022/6/2 10:12
 */
public class WeakReferenceDemo {


    /**
     * 弱引用测试
     * 结论： 直接清除弱引用
     * 场景：ThreadLoal
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        WeakReference<byte[]> sc = new WeakReference<>(new byte[ 1024* 1024 * 10]);

        System.out.println(sc.get());
        System.gc();

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(sc.get());

    }

}
