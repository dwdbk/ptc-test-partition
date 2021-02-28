package com.partition;

import java.util.*;
/**
 * Library partition
 * @version 0.1.0
 * @author DwD
 */
public class PartitionLibrary {
    /**
     * @param list a list of numbers
     * @param partitionSize a size of sublist
     * @return list of list with the given size
     * @throws IllegalArgumentException If the list is NULL OR the size is negative or equal to 0.
     *
     */
    public static List<List<Integer>> partition(List<Integer> list, int partitionSize) {
        if (list == null){
            throw new IllegalArgumentException("Given list can't be null");
        }
        if (partitionSize <= 0){
            throw new IllegalArgumentException("Given size can't be negative or zero");
        }
        List<List<Integer>> partitions = new ArrayList<>();
        for (int i = 0; i < list.size(); i += partitionSize) {
            partitions.add(list.subList(i, Math.min(i + partitionSize, list.size())));
        }
        return partitions;
    }
}