package com.company.shape;

public interface Figure {
    default String defaultProducer(){
        return "random figure";
    }
}
