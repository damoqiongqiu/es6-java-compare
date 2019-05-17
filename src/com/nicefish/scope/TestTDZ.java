package com.nicefish.scope;

public class TestTDZ {
    private static String userName="damoqiongqiu";

    public static void main(String[] args) {
        System.out.println(userName);
        String userName="大漠穷秋";
        System.out.println(userName);
    }
}
