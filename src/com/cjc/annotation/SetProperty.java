package com.cjc.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
//使得他可以使用反射
@Retention(RetentionPolicy.RUNTIME)
public @interface SetProperty {
    String value();
    int length();
}
