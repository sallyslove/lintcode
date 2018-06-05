package com.lintcode.simple;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.SyncFailedException;
import java.util.Date;
import java.text.SimpleDateFormat;
import org.w3c.dom.Document;

import java.io.InputStream;

/**
 * Created by eligshn on 2017/6/14.
 */
public class FibonacciTest {
    private Fibonacci fib;

    @Before
    public void setUp(){
        fib = new Fibonacci();
    }

    @Test
    public void testFibonacci(){
        Assert.assertEquals("", 2 , fib.fibonacci(4));
    }

    @Test
    public void testFibonacci1(){
        Assert.assertEquals("", 34, fib.fibonacci(10));
    }

    @Test
    public void testFibonacci47(){
        Assert.assertEquals("", 1836311903, fib.fibonacci(47));
    }
}
