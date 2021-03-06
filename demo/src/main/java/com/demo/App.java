/**
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.partition.PartitionLibrary;

/**
 * Class demo to test the Library partition
 * @author DwD
 */
public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("partition " + PartitionLibrary.partition(intList, 0));
        System.out.println("partition " + PartitionLibrary.partition(intList, 2));
    }
}
