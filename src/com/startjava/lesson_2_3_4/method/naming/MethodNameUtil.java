package com.startjava.lesson_2_3.method.naming;

public class MethodNameUtil {
    public static String get() {
        return new Exception().getStackTrace()[1].getMethodName();
    }
}