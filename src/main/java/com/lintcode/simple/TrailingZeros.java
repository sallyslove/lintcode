package com.lintcode.simple;

/**
 * Created by eligshn on 2018/5/24.
 */
public class TrailingZeros {
    /*
    * @param n: An integer
    * @return: An integer, denote the number of trailing zeros in n!
    */
    public long trailingZeros(long n) {;
//        long count = 0;
//        for(int i = 5;i <= n;i = i+5) {
//            int j = i;
//            while (j%5 == 0){
//                count++;
//                j = j/5;
//            }
//        }
//        return  count;
        long count=0;
        while(n>0){
            count+=(n/5);
            n/=5;
        }
        return count;
    }
}
