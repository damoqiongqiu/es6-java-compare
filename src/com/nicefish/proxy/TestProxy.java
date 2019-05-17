package com.nicefish.proxy;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * 业务要求：我们需要监控HashMap的性能，把HashMap里面所有方法的调用时间全部打印出来。
 * @author 大漠穷秋
 */
public class TestProxy {

    public static void main(String[] args) {
        Map map=(Map)Proxy.newProxyInstance(
                System.class.getClassLoader(),
                HashMap.class.getInterfaces(),
                new ClockInvocationHandler(new HashMap<>())
        );

        map.put("hello","world!");
        map.get("hello");
        map.clear();
        map.size();

        System.out.println(map instanceof Map);
        System.out.println(map instanceof HashMap);
        System.out.println(map.getClass().getName());

    }
}
