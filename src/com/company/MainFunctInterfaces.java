package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MainFunctInterfaces {
    public static void main(String[] args) {
        MainFunctInterfaces main = new MainFunctInterfaces();
        BinaryOperator<Integer> summation = (a,b) -> a+b;
        System.out.println(summation.apply(300,30));

        Consumer<String> stringConsumer = (a) -> System.out.println(a + " was consumed");
        String msg = "MESSAGE";
        stringConsumer.accept(msg);
        System.out.println(msg);


        //predicate check
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        System.out.println("Print all numbers:");
        main.eval(integers, n->true);

        System.out.println("Print even numbers:");
        main.eval(integers, n->n%2==0);
        System.out.println("Print numbers greater than three:");
        main.eval(integers, n->n>3);

    }

    private void eval(List<Integer> list, Predicate<Integer> predicate){
        for(Integer n: list){
            if(predicate.test(n)){
                System.out.println(n);
            }
        }

    }
}
