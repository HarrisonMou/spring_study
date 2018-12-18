package com.harrison.study.spring_study04.chapter1;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private Class target;

    public MyInvocationHandler(Class target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
        System.out.println(declaredAnnotations.length);
        for (int i = 0; i < declaredAnnotations.length; i++) {
            System.out.println(declaredAnnotations[i].toString());
        }

        System.out.println(method.getName());

        Object invoke = method.invoke(target.newInstance(), args);

        return invoke;
    }

    public static MyInvocationHandler instance(Class target){
        return new MyInvocationHandler(target);
    }
}
