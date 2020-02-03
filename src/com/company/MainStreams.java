package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MainStreams {
    public static void main(String[] args) {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        //map
        List<Integer> list = Arrays.asList(2,3,4);
        List<Integer> uniqueSquares = list.stream().map(i->i*i).collect(Collectors.toList());
        uniqueSquares.forEach(System.out::println);
        //filter
        System.out.println("PRINT");
        List<Integer> filteredList = uniqueSquares.stream().filter(i-> i>4).collect(Collectors.toList());
        filteredList.forEach(System.out::println);
        //limit
        System.out.println("LIMIT");
        List<Integer> limitedList = uniqueSquares.stream().limit(2).collect(Collectors.toList());
        limitedList.forEach(System.out::println);
        //sorted
        System.out.println("SORTED");
        Random random2 = new Random();
        random2.ints().limit(5).sorted().forEach(System.out::println);
        System.out.println("SORTED2");
        List<Integer> integers = Arrays.asList(7,9,3,4,5,2,1,6,4);
        integers.stream().sorted().forEach(System.out::println);

    }
}
