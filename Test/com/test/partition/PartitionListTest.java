package com.test.partition;

import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class PartitionListTest {


    @Test
    public void partitionTest(){
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            listOfNumbers.add(i);
        }
        ArrayList<ArrayList<Integer>> expected = new ArrayList<> ();
        expected.add(new ArrayList<>(Arrays.asList(1,2)));
        expected.add(new ArrayList<>(Arrays.asList(3,4)));
        expected.add(new ArrayList<>(Arrays.asList(5)));
        assertEquals(expected, PartitionList.partition(listOfNumbers, 2));

    }
}