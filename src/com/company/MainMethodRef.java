package com.company;

import java.util.ArrayList;
import java.util.List;

public class MainMethodRef {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Mahesh");
        names.add("Suresh");
        names.add("Prateek");

        names.forEach(System.out::println);
    }
}
