package org.launchcode.java;

import org.launchcode.java.studios.areaofacircle.Circle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double radius;
        Double area;
        Scanner input;
        input= new Scanner(System.in);
        System.out.println("Enter the radius: ");
        radius = input.nextDouble();
        area = Circle.getArea(radius);
        while(radius < 0  ){
            System.err.println("Please enter a valid data type!");
            System.out.println("Enter the radius: ");
            radius= input.nextDouble();
        }
        System.out.println("The area of a circle of radius " + radius + " is: " + area);

    }
}
