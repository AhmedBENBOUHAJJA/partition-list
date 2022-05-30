package com.test.partition;

import java.util.ArrayList;

public class PartitionList {


    public static void main(String[] args) {
        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(10);
        inputList.add(22);
        inputList.add(34);
        inputList.add(46);
        inputList.add(59);
        System.out.println(PartitionList.partition(inputList, 2));

    }

    public static ArrayList<ArrayList<Integer>> partition (ArrayList<Integer> listOfNumbers, Integer lengthOfSubList){

        ArrayList<ArrayList<Integer>> partitionList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;
        while (i < listOfNumbers.size())
        {
            list.clear();
            for ( int j = 0; j < lengthOfSubList; j++)
            {
                if((j + i) < listOfNumbers.size())
                    list.add(listOfNumbers.get(i + j));
            }
            partitionList.add((ArrayList<Integer>) list.clone());
            i += lengthOfSubList;
        }

        return partitionList;
    }
}
