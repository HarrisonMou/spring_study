package com.harrison.study.spring_study04.chapter1;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class MyInvocationHandler implements InvocationHandler {

    private Class target;

    public MyInvocationHandler(Class target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        Method[] methods = target.getDeclaredMethods();

        Optional<Method> targetMethod = Arrays.stream(methods).filter(x -> x.getName().equals(method.getName())).findFirst();
        Annotation[] annotations = new Annotation[0];
        if(targetMethod.isPresent()){
            annotations = targetMethod.get().getDeclaredAnnotations();
        }

        if(isStreamContainsTargetClass(annotations, Before.class)){
            System.out.println("该方法带有@Before注解");
        }

        Object invoke = method.invoke(target.newInstance(), args);

        if(isStreamContainsTargetClass(annotations, After.class)){
            System.out.println("该方法带有@After注解");
        }

        return invoke;
    }

    public static MyInvocationHandler instance(Class target){
        return new MyInvocationHandler(target);
    }

    private Boolean isStreamContainsTargetClass(Annotation[] annotations, Class clazz){
        return  Arrays.stream(annotations).anyMatch(x -> clazz.getName().equals(x.annotationType().getName()));
    }
}
