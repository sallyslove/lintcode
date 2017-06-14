package com.lintcode.simple;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by eligshn on 2017/6/14.
 */
public class RectangleTest {
    private Rectangle rec;

    @Before
    public void setUp(){
        rec = new Rectangle(3, 4);
    }

    @Test
    public void testArea(){
        Assert.assertTrue(12 == rec.getArea());
    }
}
