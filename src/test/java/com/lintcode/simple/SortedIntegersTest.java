package com.lintcode.simple;


import org.junit.Before;
import org.junit.Test;

/**
 * Created by eligshn on 2017/6/15.
 */
public class SortedIntegersTest {
    private SortedIntegers sortMachine;

    @Before
    public void setUp(){
        sortMachine = new SortedIntegers();
    }

    @Test
    public void testSort(){
        int[] testGroup = {2,5,8,4,9,44,77,23,12,56};
        for(int i = 0; i < testGroup.length; ++i){
            sortMachine.sortIntegers(testGroup);
            System.out.println(testGroup[i]);
        }
    }
    @Test
    public void testSort1(){
        int[] testGroup = {3, 2, 1, 4, 5};
        for(int i = 0; i < testGroup.length; ++i){
            sortMachine.sortIntegers(testGroup);
            System.out.println(testGroup[i]);
        }
    }
}
