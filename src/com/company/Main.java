package com.company;

import com.company.shape.impl.Triangle;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle.useTheMethods());
        System.out.println(triangle.useTheOverwrittenMethods());
    }
}
