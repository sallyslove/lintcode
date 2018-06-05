package com.lintcode.simple;

import javax.xml.bind.JAXBContext;

/**
 * Created by eligshn on 2017/6/14.
 */
public class Fibonacci {
    private static JAXBContext jaxbContextForSubs;

//    public int fibonacci(int n) {
//        if(1 == n || 0 == n) {
//            return 0;
//        }
//        if(2 == n){
//            return 1;
//        }
//        return fibonacci(n-1) + fibonacci(n-2);
//    }
    public int fibonacci(int n) {
        Throwable t = new Throwable();
        StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
        for (StackTraceElement s : stacks) {
            System.out.println("-------" + s.getMethodName() + " : " + s);
        }
        int fib1 = 0;
        int fib2 = 1;
        int fibn = 0;
        if (2 == n) {
            fibn = 1;
        }
        for (int index = 3; index <= n; ++index) {
            fibn = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibn;
        }
        return fibn;
    }
}
