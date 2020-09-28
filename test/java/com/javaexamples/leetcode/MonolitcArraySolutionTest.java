package com.javaexamples.leetcode;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MonolitcArraySolutionTest {
    private static final String MONOLITIC_INC = "Array is not incresing monolitic. ";
    private static final String MONOLITIC_DEC = "Array is not decresing monolitic. ";

    @Test
    public void isMonoliticIncresing() {
        boolean isTrue = MonolitcArraySolution.isMonotonic(new int[]{1, 2, 3, 6});
        assertTrue(MONOLITIC_INC, isTrue);
    }

    @Test
    public void isMonoliticIncresing2() {
        assertTrue(MONOLITIC_INC, MonolitcArraySolution.isMonotonic(new int[]{1, 2, 3, 6, 4}));
    }

    @Test
    public void isMonoliticDecresing() {
        assertTrue(MONOLITIC_DEC, MonolitcArraySolution.isMonotonic(new int[]{10, 9, 8, 7}));
    }

    @Test
    public void isMonoliticDecresing2() {
        assertTrue(MONOLITIC_DEC, MonolitcArraySolution.isMonotonic(new int[]{10, 9, 8, 11, 7}));
    }
}