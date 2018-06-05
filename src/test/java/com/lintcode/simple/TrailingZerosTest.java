package com.lintcode.simple;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by eligshn on 2018/5/30.
 */
public class TrailingZerosTest {
    private TrailingZeros trailingZeros;

    @Before
    public void setUp(){
        trailingZeros = new TrailingZeros();
    }

    @Test
    public void testCase1(){
        Assert.assertEquals(2, trailingZeros.trailingZeros(11));
    }
}
