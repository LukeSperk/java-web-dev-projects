package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double radius = input.nextDouble();
        boolean validate = Double.isNaN(radius);
        double area = Circle.getArea(radius);
        if (validate || radius <= 0) {
            System.out.println("please enter a positive number.");
        } else {
            System.out.println("The area of a circle of radius " + radius + " is: " + area + validate);
        }
        input.close();

    }

}
