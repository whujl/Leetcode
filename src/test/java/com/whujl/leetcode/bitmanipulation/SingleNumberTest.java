package com.whujl.leetcode.bitmanipulation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingleNumberTest {

    private int[] singleArray;
    private int[] testArray;

    @Before
    public void init() {
        singleArray = new int[]{1};
        testArray = new int[]{1, 56, 1, 65, 56, 2, 2, 3, 3};
    }


    @Test
    public void testOnlyOneNumberInTheArray() {
        assertEquals(1, SingleNumber.findTheSingleNum(singleArray));
    }

    @Test
    public void testFindSingleNumInArray() {
        assertEquals(65, SingleNumber.findTheSingleNum(testArray));
    }

}
