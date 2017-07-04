package com.lintcode.simple;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by eligshn on 2017/7/4.
 */
public class MetatheticalStringTest {
    private MetatheticalString test;

    @Before
    public void setUp(){
        test = new MetatheticalString();
    }

    @Test
    public void test1(){
        Assert.assertFalse(test.stringPermutation("abbc", "abcc"));
    }

    @Test
    public void test2(){
        Assert.assertTrue(test.stringPermutation("abbc", "acbb"));
    }

    @Test
    public void test3(){
        Assert.assertTrue(test.stringPermutation("", ""));
    }

    @Test
    public void test4(){
        Assert.assertFalse(test.stringPermutation("abbc", "acdb"));
    }

    @Test
    public void test5(){
        Assert.assertFalse(test.stringPermutation("asfhjhsajfhjahsfueuhuqpasjfnmxznbdsafueqhuuuhuhuihu7y8u87890-0---kjsafkjaskjfsalkfnmzxncmncfafuenfjasnfjkanhds", "afkjaskhjaafuehfasfhjhsajfhuh-kjsjasnfjkanhdshsfuihu7y8u87890-0-fueqhuuujfqpalkfnmz-ueuhufnmsjsaxznbdsaxncmncf"));
    }

    @Test
    public void test6(){
        Assert.assertTrue(test.stringPermutation("^&*#$@%@%@$%@$!*&*&*)))!)()())( **jsafhjhsajfhthisisa lint", "^&)!)(%))thijhsajfhs)())( **jsafh*#$@%@$!*&*&sa lint*@%@$i"));
    }
}
