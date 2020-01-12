package com.cjc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationTest {
//    传入的值
    String value();
    int classId();
}
class AnnDemo{
    private String name;
    @AnnotationTest(value = "123",classId = 3)
    public void add(){

    }
}
