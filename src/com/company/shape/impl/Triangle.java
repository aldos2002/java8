package com.company.shape.impl;

import com.company.shape.Figure;
import com.company.shape.Shape;

public class Triangle implements Shape, Figure {
    public String useTheMethods(){
        Shape shape = new Triangle();
        return shape.defaultProducer();
    }

    public String useTheOverwrittenMethods(){
        return defaultProducer();
    }

//    @Override
//    public String defaultProducer() {
//        return "Overwritten" + Shape.producer();
//    }

    public String defaultProducer(){
        return Figure.super.defaultProducer();
    }
}
