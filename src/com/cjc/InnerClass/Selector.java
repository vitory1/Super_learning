package com.cjc.InnerClass;

/**
 * 连接到外部类
 */
public interface Selector {
    boolean end();
    Object current();
    void next();
}
