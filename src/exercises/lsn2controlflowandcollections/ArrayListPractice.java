package exercises.lsn2controlflowandcollections;

import java.util.ArrayList;

import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        //Part one
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        Integer sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println(sum);

        //Part two
        ArrayList<String> words = new ArrayList<>();
        words.add("study");
        words.add("stem");
        words.add("tiger");
        words.add("good");
        words.add("serve");
        words.add("competition");
        /*
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() == 5) {
                System.out.println(words.get(i));
            }
        }
        */
        //Part three
        Scanner input = new Scanner(System.in);
        System.out.println("Length of word?" );
        Integer inputWordLength = input.nextInt();

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() == inputWordLength) {
                System.out.println(words.get(i));
            }
        }

    }
}
