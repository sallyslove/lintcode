package com.lintcode.simple;

/**
 * Created by eligshn on 2017/6/14.
 */
public class SortedIntegers {
    public void sortIntegers(int[] group) {
        for(int i = 1; i < group.length; ++i){
            int value = group[i];
            for(int j = 0; j < i; ++j){
                if(group[j] > value){
                    int temp = group[j];
                    int temp1;
                    group[j] = value;
                    for(int k = j + 1; k <= i; ++k){
                        temp1 = group[k];
                        group[k] = temp;
                        temp = temp1;
                    }
                    break;
                }
            }
        }
    }
}
