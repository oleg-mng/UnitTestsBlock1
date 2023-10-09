package com.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListOperationsTest {

    private static List<Integer> listNumbers1;
    private static List<Integer> listNumbers2;
    private static List<Integer> listNumbers3;
    private static List<String> listWords;

    @BeforeAll
    public static void createLists() {
        listNumbers1 = new ArrayList<>(Arrays.asList(4, 7, 9));
        listNumbers2 = new ArrayList<>(Arrays.asList(3, 1, 11));
        listNumbers3 = new ArrayList<>(Arrays.asList(-15, -3, -7));
        listWords = new ArrayList<>(Arrays.asList("Hello", "World", "One", "Two"));
    }

    @Test
    public void CheckSumOfElementsAtTheSamePosition() {
        List<Integer> result = new ArrayList<>(Arrays.asList(7, 8, 20));
        List<Integer> resultTest = ListOperations.sumLists(listNumbers1, listNumbers2);
        assertEquals(result, resultTest, "the method sumLists is not working correctly");
    }

    @Test
    public void CompareOfMaximumValueInList() {
        assertEquals(9, ListOperations.findMax(listNumbers1), "the method findMax is not working correctly");
        assertEquals(-3, ListOperations.findMax(listNumbers3), "the method findMax is not working correctly");
    }

    @Test
    public void filterListByNumberOfCharInElement() {
        List<String> result = new ArrayList<>(Arrays.asList("Hello", "World"));
        List<String> resultTest = ListOperations.filterStrings(listWords, 4);
        assertEquals(result, resultTest, "the method filterStrings is not working correctly");
    }
    @Test
    public void filterListByNumberOfCharOnNull() {
        List<String> resultTest = ListOperations.filterStrings(listWords, 6);
        assertTrue(resultTest.isEmpty());
    }
}