package com.stackroute.basics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RectanglePerimeter {
    public static void main(String[] args) {
        new RectanglePerimeter().getValues();
    }

    //get user input from console
    public void getValues() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println(" Enter  the length & breadth : ");
    	double length = sc.nextDouble();
    	double breadth = sc.nextDouble();
    	double perimeter =new RectanglePerimeter().perimeterCalculator(length, breadth);
    	System.out.println(" Perimeter of the Rectangle :: "+perimeter);
     }

    //write logic to find perimeter of rectangle here
    public double perimeterCalculator(double length, double breadth) {
    	//your business logic 
    	double perimeter = 2 * (length + breadth);
        return perimeter;
    }
}
