package exercises.lsn2controlflowandcollections;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        //create and initalize
        int[] practiceArray = {1, 1, 2, 3, 5, 8};

        //loop thru & print odds
        for (int number : practiceArray) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }

       //string -> split --> array
       String practiceString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] practiceSentence = practiceString.split(" ");
        System.out.println(Arrays.toString(practiceSentence));

        //split into different sentences
        String[] separateSentences = practiceString.split("\\.");
        System.out.println(separateSentences.length);
        System.out.println(Arrays.toString(separateSentences));
        //for (String i : separateSentences)
            //System.out.println(i + "\n");
    }
}
