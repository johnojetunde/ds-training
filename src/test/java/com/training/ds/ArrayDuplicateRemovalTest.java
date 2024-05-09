package com.training.ds;

import org.junit.jupiter.api.Test;

import static com.training.ds.ArrayDuplicateRemoval.removeDuplicate;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AlgorithmTest {

    @Test
    void tes_whenThereIsNoDuplicate() {
        var result = removeDuplicate(new int[]{1, 2, 3, 4, 5});

        assertEquals(5, result);
    }

    @Test
    void test_whenThereIs1Duplicate() {
        var result = removeDuplicate(new int[]{1,1, 2, 3, 4, 5});

        assertEquals(6, result);
    }

    @Test
    void test_whenThereIs2Duplicate() {
        var result = removeDuplicate(new int[]{1,1, 1,2, 3, 4, 5});

        assertEquals(6, result);
    }

    @Test
    void test_whenThere_firstExample() {
        var result = removeDuplicate(new int[]{1,1,1,2,2,3});

        assertEquals(5, result);
    }

    @Test
    void test_whenThere_SecondExample() {
        var result = removeDuplicate(new int[]{-3,-1,0,0,0,3,3});

        assertEquals(6, result);
    }
}