package edu.mango.java.jvm;

import java.lang.ref.SoftReference;

/**
 * @author mango
 * @version 1.0
 * @description TODO
 * @email
 * @date 2022/6/2 10:12
 */
public class SoftReferenceDemo {


    /**
     * 软引用测试
     * 结论： 当内存不够的时候，gc优先清除软引用，当内存够用时，不清除
     * 场景：缓存备用 --大图片，主要用作缓存
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        SoftReference<byte[]> sc = new SoftReference<>(new byte[ 1024* 1024 * 10]);

        System.out.println(sc.get());
        System.gc();

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(sc.get());

        //再分配一个10M的内存
        byte[] b = new byte[1024*1024*10];
        System.out.println(sc.get());
    }

}
