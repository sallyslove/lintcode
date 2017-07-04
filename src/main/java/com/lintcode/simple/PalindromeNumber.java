package com.lintcode.simple;

/**
 * Created by eligshn on 2017/7/4.
 */
public class PalindromeNumber {

    /**
     * @param num a positive number
     * @return true if it's a palindrome or false
     */
    public boolean palindromeNumber(int num) {
        if (num <= 0) {
            return false;
        }

        String numString = String.valueOf(num);
        char[] numChar = new char[numString.length()];
        char[] numMirror = new char[numString.length()];

        numString.getChars(0, numString.length(), numChar, 0);

        for (int index = numChar.length - 1; index >= 0; --index){
            numMirror[numChar.length - 1 - index] = numChar[index];
        }

        if (numString.equals(String.valueOf(numMirror))) {
            return true;
        }
        return false;
    }
}
