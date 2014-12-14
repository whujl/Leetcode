package com.whujl.leetcode.bitmanipulation;

public class SingleNumber {

    public static int findTheSingleNum(int[] source) {
        int result = 0;

        for(int i : source) {
            result = result ^ i;
        }
        return result;
    }
}
