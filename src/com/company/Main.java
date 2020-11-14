package com.company;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

	for(int i=1; i<=100; i++){
        int max=150;
        int min=0;
        int randX = (int)(Math.random()*(max-min)) + min;
        int randY = (int)(Math.random()*(max-min)) + min;
        int randRadius = (int)(Math.random()*(max/4));

        Point circleCenter = new Point();
        circleCenter.pointX = randX;
        circleCenter.pointY = randY;

        Circle testCircle = new Circle();
        testCircle.center = circleCenter;
        testCircle.radius=randRadius;
        int randColor =(int)(Math.random()* testCircle.circleColor.length);

        if (i > 1) {
            System.out.println();
        }
        System.out.format("Circle-"+testCircle.circleName.format("%03d", i));
        System.out.println();
        System.out.println("(" + testCircle.center.pointX +"," + testCircle.center.pointY + ")");
        System.out.println("Radius = " + testCircle.radius);
        System.out.println("CircleColor = "+ testCircle.circleColor[randColor]);
	}
    }
}
