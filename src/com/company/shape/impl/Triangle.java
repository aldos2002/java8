package com.company.shape.impl;

import com.company.shape.Shape;

public class Triangle implements Shape {
    public String useTheMethods(){
        Shape shape = new Triangle();
        return shape.defaultProducer();
    }

    public String useTheOverwrittenMethods(){
        return defaultProducer();
    }

    @Override
    public String defaultProducer() {
        return "Overwritten" + Shape.producer();
    }
}
