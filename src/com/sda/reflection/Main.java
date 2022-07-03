package com.sda.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {




    public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
                                                    IllegalAccessException, NoSuchMethodException,
                                                    InvocationTargetException {

        Class<?> myCLass = Class.forName("com.sda.reflection.MyExampleClass");
        MyExampleClass myExampleClass_1 = (MyExampleClass) myCLass.newInstance();
        MyExampleClass myExampleClass_2 = (MyExampleClass) myCLass.getDeclaredConstructor().newInstance();

        System.out.println(myExampleClass_1);
        System.out.println(myExampleClass_2);

        Method isObject = myCLass.getDeclaredMethod("isObject");
        isObject.setAccessible(true);
        System.out.println(isObject.invoke(myExampleClass_1));
        System.out.println(isObject.invoke(myExampleClass_2));

        Method setter = myCLass.getDeclaredMethod("setSomeNumber", Integer.class);
        setter.invoke(myExampleClass_1, 10);
        System.out.println(myExampleClass_1.getSomeNumber());

    }
}
