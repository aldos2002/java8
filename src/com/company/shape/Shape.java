package com.company.shape;

public interface Shape {
    static String producer(){
        return "Producer invoked";
    }

    default String defaultProducer(){
        return String.format("THE DEFUALT %s", producer());
    }

    String useTheMethods();
}

