package com.company;

import java.lang.Math;

public class Main {

    static String[] circleColors = {"Red", "Green", "Yellow", "Blue", "Purple", "Cyan", "Orange", "Brown", "White", "Black"};

    public static void main(String[] args) {
        float sum = 0;
        float average = 0;
        int totalNum = 100;


        int countColors[] = new int[circleColors.length];

        for (int i = 1; i <= totalNum; i++) {
            int max = 150;
            int min = 0;
            int randX = (int) (Math.random() * (max - min)) + min;
            int randY = (int) (Math.random() * (max - min)) + min;
            int randRadius = (int) (Math.random() * (max / 4));

            Point circleCenter = new Point();
            circleCenter.pointX = randX;
            circleCenter.pointY = randY;

            Circle testCircle = new Circle();
            testCircle.circleName="Circle-" + String.format("%03d", i);
            testCircle.center = circleCenter;
            testCircle.radius = randRadius;
            int randColor = (int) (Math.random() * circleColors.length);
            testCircle.color = circleColors[randColor];

            countColors[randColor]= countColors[randColor]+1;

            if (i > 1) {
                System.out.println();
            }
            testCircle.Print(i);
            float add = (float) testCircle.CalculateArea();
            sum = sum + add;

        }
        System.out.println();
        System.out.println("The Sum of Areas = " + sum);
        average = sum / totalNum;
        System.out.println("The Average of Areas = " + average);

        for (int i=0; i< countColors.length; i++){
            System.out.println(circleColors[i] + " =" + countColors[i]);
        }
    }
}
