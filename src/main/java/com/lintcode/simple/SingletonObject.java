package com.lintcode.simple;

/**
 * Created by eligshn on 2017/6/16.
 */
public class SingletonObject {
    private static SingletonObject obj;

    public static SingletonObject getInstance() {
        if (null == obj){
            obj = new SingletonObject();
        }
        return obj;
    }
}
