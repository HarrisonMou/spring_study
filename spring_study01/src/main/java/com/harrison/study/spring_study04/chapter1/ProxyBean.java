package com.harrison.study.spring_study04.chapter1;

import java.lang.reflect.Proxy;

public class ProxyBean{

    private Class target;

    private Object getProxyBean(Class clazz){
        this.target = clazz;
        Object proxy = Proxy.newProxyInstance(target.getClassLoader(),
                target.getInterfaces(),
                MyInvocationHandler.instance(target));
        return proxy;
    }

    private static class Holder{
        final static ProxyBean instance = new ProxyBean();
    }

    public static Object instance(Class clazz){
        return Holder.instance.getProxyBean(clazz);
    }
}
