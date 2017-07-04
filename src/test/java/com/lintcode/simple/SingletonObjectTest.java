package com.lintcode.simple;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by eligshn on 2017/6/16.
 */
public class SingletonObjectTest {
    @Test
    public void testSingletonObject(){
        SingletonObject a = SingletonObject.getInstance();
        SingletonObject b = SingletonObject.getInstance();
        Assert.assertTrue(a == b);
    }
}
