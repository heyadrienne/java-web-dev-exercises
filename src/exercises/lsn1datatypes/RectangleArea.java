package exercises.lsn1datatypes;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Length of rectangle:");
        double length = input.nextDouble();
        //String length = input.nextInt();

        System.out.println("Width of rectangle:");
        double width = input.nextDouble();

        input.close();

        double area = length * width;
        System.out.println("Area of rectangle is " + area + ".");


    }


}
