package com.nicefish.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ClockInvocationHandler implements InvocationHandler {
    private Object original;

    public ClockInvocationHandler(Object original){
        this.original=original;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start=System.nanoTime();
        System.out.println("开始调用方法>"+method.getName());
        Object result=method.invoke(this.original,args);
        long end=System.nanoTime();
        long time=end-start;
        System.out.println(method.getName()+"方法执行了>"+time+"纳秒");
        return result;
    }
}
