package com.lintcode.simple;

/**
 * Created by eligshn on 2017/6/14.
 */
public class Fibonacci {
    public int fibonacci(int n) {
        if(1 == n || 0 == n) {
            return 0;
        }
        if(2 == n){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
