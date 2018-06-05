package com.lintcode.simple;

/**
 * Created by eligshn on 2018/5/11.
 */
 class AplusB {
    /**
     * @param a: An integer
     * @param b: An integer
     * @return: The sum of a and b
     */
    public int aplusb(int a, int b) {
        int sum = 0;

        while (b != 0) {
            sum = a ^ b;
            int carry = (a & b) << 1;
            a = sum;
            b = carry;
        }

        return sum;
    }
}
