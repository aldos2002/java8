package com.company;

import com.company.shape.impl.Triangle;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        Triangle triangle = new Triangle();
        System.out.println(triangle.useTheMethods());
//        String s = MethodRefs::staticMethod;
        System.out.println(triangle.useTheOverwrittenMethods());
        System.out.println();

//        Optional<String> optString = Optional.of(str);
//        optString.is;

        MathOperation addition = (int a, int b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (int a, int b) -> {
            int booma = a;
            int boomb = b;
            return booma * boomb;
        };
        MathOperation division = (int a, int b) -> a / b;

        System.out.println(main.operate(10, 5, addition));
        System.out.println(main.operate(10, 5, subtraction));
        System.out.println(main.operate(10, 5, multiplication));
        System.out.println(main.operate(10, 5, division));


    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate (int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
