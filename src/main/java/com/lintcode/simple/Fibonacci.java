package com.lintcode.simple;

/**
 * Created by eligshn on 2017/6/14.
 */
public class Fibonacci {
    /**
     * 递归实现的时间复杂度太高了，45往上效率就不行了
     */
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
        int fib1 = 0;
        int fib2 = 1;
        int fibn = 0;
        if(2 == n) {
            fibn = 1;
        }
        for(int index = 3; index <= n; ++index){
            fibn = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibn;
        }
        return fibn;
    }
}
