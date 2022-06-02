package edu.mango.java.jvm;

import java.io.IOException;

/**
 * @author mango
 * @version 1.0
 * @description TODO
 * @email
 * @date 2022/6/2 9:57
 */
public class FinalizeDemo {

    /**
     * finalize 大多数情况不要重写，容易内存溢出
     * reason：回收效率变低
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize();");
        super.finalize();
    }

    public static void main(String[] args) throws IOException {

        //强引用
        FinalizeDemo finalizeDemo = new FinalizeDemo();

        //打断强引用
        finalizeDemo = null;

        System.gc();
        System.out.println(finalizeDemo);

        System.in.read();
    }
}
