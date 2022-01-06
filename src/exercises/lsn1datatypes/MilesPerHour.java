package exercises.lsn1datatypes;

import java.util.Scanner;

public class MilesPerHour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Number of miles driven:");
        int milesDriven = input.nextInt();

        System.out.println("Gallons of gas used:");
        int gallonsOfGas = input.nextInt();

        input.close();

        int mpg = milesDriven / gallonsOfGas;
        System.out.println("Your miles per gallon is " + mpg + ".");


    }

}
