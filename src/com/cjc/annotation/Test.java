package com.cjc.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> forName = Class.forName("com.cjc.annotation.UserEntity");
        SetTable setTable = forName.getAnnotation(SetTable.class);
        Field[] declaredFields = forName.getDeclaredFields();
        StringBuffer sf = new StringBuffer();
        sf.append("select ");
        for (int i= 0;i<declaredFields.length;i++){
            SetProperty setProperty = declaredFields[i].getAnnotation(SetProperty.class);
            String property = setProperty.value();
            if (!(i<declaredFields.length-1)){
                sf.append(property+" from ");
            }else {
                sf.append(property+" , ");
            }
        }
        String tableName = setTable.value();
        sf.append(tableName);
        System.out.println(sf);

    }
}
