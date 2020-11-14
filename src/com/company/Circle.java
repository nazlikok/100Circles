package com.company;

public class Circle {
    Point center;
    int radius;
    String color;
    String circleName;

    float CalculateArea(){
        float Area = (float) Math.PI*radius*radius;
        return Area;
    }
}
