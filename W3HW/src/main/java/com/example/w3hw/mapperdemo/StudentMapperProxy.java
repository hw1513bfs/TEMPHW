package com.example.w3hw.mapperdemo;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StudentMapperProxy implements InvocationHandler {
    Object obj;

    public StudentMapperProxy(Object obj) {
        this.obj = obj;
    }

    public Object invoke(Object proxy, Method m, Object[] args) throws
            Throwable {
        try {
            // Do something on real object
            return m.invoke(obj, args);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (Exception e) {
            throw e;
        }
    }

    public static Object newInstance(Object obj, Class[] interfaces) {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                interfaces,
                new StudentMapperProxy(obj));
    }
}
