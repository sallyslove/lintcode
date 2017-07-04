package com.lintcode.simple;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by eligshn on 2017/7/4.
 */
public class PalindromeNumberTest {
    private PalindromeNumber test;

    @Before
    public void setUp(){
        test = new PalindromeNumber();
    }

    @Test
    public void test1(){
        Assert.assertTrue(test.palindromeNumber(11));
    }

    @Test
    public void test2(){
        Assert.assertTrue(test.palindromeNumber(1));
    }

    @Test
    public void test3(){
        Assert.assertTrue(test.palindromeNumber(12321));
    }

    @Test
    public void test4(){
        Assert.assertFalse(test.palindromeNumber(1232));
    }
}
