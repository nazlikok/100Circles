package com.company;

import java.lang.Math;
import java.util.*;

public class Main {

    static String[] circleColors = {"Red", "Green", "Yellow", "Blue", "Purple", "Cyan", "Orange", "Brown", "White", "Black"};

    public static void main(String[] args) {
        float sum = 0;
        float average = 0;
        int totalNum = 100;
        int max = 150;
        int min = 0;

        Point point = new Point();
        point.pointX = (int) (Math.random() * max);
        point.pointY = (int) (Math.random() * max);
        System.out.println("Point = " + point.pointX + "," + point.pointY + "\n");


        int countColors[] = new int[circleColors.length];
        //int generatedCircles [] = new int[totalNum];

        Circle farthestCircle = new Circle();
        farthestCircle.center = new Point();
        farthestCircle.center.pointX = Integer.MIN_VALUE;
        farthestCircle.center.pointY = Integer.MIN_VALUE;

        Circle closestCircle = new Circle();
        closestCircle.center = new Point();
        closestCircle.center.pointX = Integer.MIN_VALUE;
        closestCircle.center.pointY = Integer.MIN_VALUE;


        Circle redCircles[] = new Circle[totalNum];

        for (int i = 1; i <= totalNum; i++) {

            Circle testCircle = new Circle();
            int randX = (int) (Math.random() * (max - min)) + min;
            int randY = (int) (Math.random() * (max - min)) + min;
            int randRadius = (int) (Math.random() * (max / 4));

            Point circleCenter = new Point();
            circleCenter.pointX = randX;
            circleCenter.pointY = randY;


            testCircle.circleName = "Circle-" + String.format("%03d", i);
            testCircle.center = circleCenter;
            testCircle.radius = randRadius;
            int randColor = (int) (Math.random() * circleColors.length);
            testCircle.color = circleColors[randColor];

            if (testCircle.color.equals("Red")){
                redCircles[i-1] =testCircle;
            }

            countColors[randColor] = countColors[randColor] + 1;

            if (i > 1) {
                System.out.println();
            }
            testCircle.Print(point);
            float add = (float) testCircle.CalculateArea();
            sum = sum + add;

            float testCircleDistance = testCircle.CalculateDistance(point);
            float closestDistance = closestCircle.CalculateDistance(point);
            if (testCircleDistance <= closestDistance){
                closestCircle = testCircle;
            }

            float farthestDistance = farthestCircle.CalculateDistance(point);
            if(testCircleDistance >= farthestDistance){
                farthestCircle = testCircle;
            }

        }

        System.out.println();
        System.out.println("The Sum of Areas = " + sum);
        average = sum / totalNum;
        System.out.println("The Average of Areas = " + average + "\n");

        for (int i = 0; i < countColors.length; i++) {
            System.out.println(circleColors[i] + " =" + countColors[i]);
        }
        System.out.println("\n");
        System.out.println("Closest Circle is = " );
        closestCircle.Print(point);
        System.out.println("\n");
        System.out.println("Farthest Circle is = " );
        farthestCircle.Print(point);


        System.out.println("\n\nRed Circles = ");
        for (int i=0; i< redCircles.length; i++){
            if(redCircles[i] == null){
                continue;
            }
            redCircles[i].Print(point);
            System.out.println();

        }

    }
}
