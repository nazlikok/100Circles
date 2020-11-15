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

    void Print(int i){
        System.out.format(circleName);
        System.out.println();
        System.out.println("(" + center.pointX + "," + center.pointY + ")");
        System.out.println("Radius = " + radius);
        System.out.println("CircleColor = " + color);
        System.out.println("CircleArea = " + CalculateArea());
    }
}
