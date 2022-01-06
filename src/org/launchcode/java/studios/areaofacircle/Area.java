package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        Double radius;

        if (scan.hasNextDouble()) {
            radius = scan.nextDouble();
            if (radius < 0) {
                System.out.println("The area of a circle of a radius " + radius + " is " + Circle.getArea(radius));
            } else System.out.println(radius + " is not a valid number.");
        } else {
            System.out.println("Please enter a valid number.");
        }
    }
}

    /*Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius:");
        Double inputRadius = input.nextDouble();
        String inputRadiusString = inputRadius.toString();
        final Double pi = 3.14;

        Double area = inputRadius * inputRadius * pi;

        if (inputRadius < 0) {
            System.out.println("Please enter a positive number.");
        } else if(inputRadiusString.equals(inputRadiusString)) {
            System.out.println("Please enter a valid number.");
        } else {
            System.out.println("The area of a circle with a radius of " + inputRadius + " is " + Circle.getArea(inputRadius) + ".");
        }
    }*/
