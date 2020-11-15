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

    void Print(int i,Point point){
        System.out.format(circleName);
        System.out.println();
        System.out.println("(" + center.pointX + "," + center.pointY + ")");
        System.out.println("Radius = " + radius);
        System.out.println("CircleColor = " + color);
        System.out.println("CircleArea = " + CalculateArea());
        System.out.println("Distance = "+ CalculateDistance(point));
    }
    float CalculateDistance(Point point){
        float distance= (float) Math.sqrt((center.pointX-point.pointX)*(center.pointX-point.pointX)+(center.pointY-point.pointY)*(center.pointY-point.pointY));
        return distance;
    }
}
