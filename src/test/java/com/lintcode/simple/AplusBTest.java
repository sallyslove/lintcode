package com.lintcode.simple;

import org.junit.*;

/**
 * Created by eligshn on 2018/5/11.
 */
public class AplusBTest {
    private AplusB aplusB;

    @Before
    public void setAplusB() {
        aplusB = new AplusB();
    }

    @Test
    public void testAplusB() {
        Assert.assertEquals("It is not equal", 8, aplusB.aplusb(3, 5));
    }

    @Test
    public void testAplusBMax() {
        Assert.assertEquals("overflow happened", -4, aplusB.aplusb(2147483646, 2147483646));
    }

    @Test
    public void testAplusNegtive() {
        Assert.assertEquals("It is not equal", -5, aplusB.aplusb(-1, -4));
    }
}
