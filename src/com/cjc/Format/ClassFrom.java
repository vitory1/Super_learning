package com.cjc.Format;

import com.cjc.Format.untity.User;
import com.cjc.Thread.entity.UserEntity;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassFrom {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
//        Class<?> forName = Class.forName("com.cjc.Format.untity.User");
//        Object newInstance = forName.newInstance();
//        User user = (User)newInstance;
//        System.out.println("user"+user);
//        user.setId("123");
//        System.out.println("id="+user.getId());
//        Class<?> forName = Class.forName("com.cjc.Format.untity.User");
//        Constructor<?> constructor = forName.getConstructor(String.class);
//        Object newInstance = constructor.newInstance("11");
//        User user = (User)newInstance;
//        System.out.println(user);
        Class<?> forName = Class.forName("com.cjc.Format.untity.User");
        Method[] methods = forName.getDeclaredMethods();
        for (Method method:methods){
            System.out.println(method.getName()+"------"+method.getReturnType());
        }
        Field[] declaredFields = forName.getDeclaredFields();
        for (Field field:declaredFields){
            System.out.println(field.getName());
        }
        Field field = forName.getDeclaredField("userId");
        Object obj= forName.getNestHost();
        field.setAccessible(true);
        field.set(obj,"123");
        User user = (User) obj;
        System.out.println(user.getId());
    }
}
