package com.nicefish.reflect;

import java.lang.reflect.Method;

public class TestUser extends Object{
    public static void main(String[] args) throws Exception{
        Class clazz=Class.forName("com.nicefish.reflect.User");

        Object object=clazz.newInstance();
        System.out.println(object instanceof User);

        Method[] methods=clazz.getMethods();
        for(Method method:methods){
//            System.out.println(method.getName());
            String methodName=method.getName();
            if("sayHello".equals(methodName)){
                method.invoke(object);
            }else if("setUserName".equals(methodName)){
                method.invoke(object,"大漠穷秋");
            }
        }
        //所有属性、哪些注解
        System.out.println(object);
    }
}
