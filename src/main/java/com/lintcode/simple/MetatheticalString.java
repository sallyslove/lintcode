package com.lintcode.simple;

/**
 * Created by eligshn on 2017/7/4.
 */
public class MetatheticalString {
    public boolean stringPermutation(String stringA, String stringB) {
        int length = stringA.length();

        if (length != stringB.length()) {
            return false;
        }

        char[] charsB = new char[stringB.length()];
        stringB.getChars(0, stringB.length(), charsB, 0);

        for (int index = 0; index < length; ++index) {
            int a = stringA.indexOf(charsB[index]);
            if (-1 == a) {
                return false;
            }
            else {
                stringA = stringA.substring(0, a) + stringA.substring(a + 1, stringA.length());
            }
        }
        return  true;
    }
}
