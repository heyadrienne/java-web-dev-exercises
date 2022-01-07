package studios.countingCharacters;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CountingChars {
    public static void main(String[] args) {
        HashMap <Character, Integer> countingChars = new HashMap <>();
        //String sentence = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String sentence = scan.nextLine();
        sentence = sentence.toLowerCase();

        char [] charactersInString = sentence.toCharArray();

        for (int i = 0; i < sentence.length(); i++) {
            int asciiValue = sentence.charAt(i);
            if(asciiValue > 96 && asciiValue < 123) {
                //for (char characters: charactersInString) {
                    if (!countingChars.containsKey(sentence.charAt(i))) {
                        countingChars.put(sentence.charAt(i), 1);
                    } else {
                        countingChars.put(sentence.charAt(i), countingChars.get(sentence.charAt(i)) +1);
                    }
                //}
            }
        }



        for (Map.Entry<Character, Integer> entry : countingChars.entrySet()) {
            System.out.println(entry.getKey() + " (" + entry.getValue() + ")");


        }
    }
}
