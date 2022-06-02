package edu.mango.java.jvm;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author mango
 * @version 1.0
 * @description TODO
 * @email
 * @date 2022/5/30 9:55
 */
public class NewObject {


    public static void main(String[] args) {

        NewObject newObject = new NewObject();

        System.out.println(ClassLayout.parseInstance(newObject));

    }

}
