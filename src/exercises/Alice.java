package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Alice {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       String aliceFirstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?";

       String aliceFirstSentenceLowerCase = aliceFirstSentence.toLowerCase();

       System.out.println("Search term?");
       String searchTerm = input.nextLine().toLowerCase();



      Boolean result = aliceFirstSentenceLowerCase.contains(searchTerm);

      System.out.println("Your result is " + result + ".");

      //print index and length
       int resultIndex = aliceFirstSentenceLowerCase.indexOf(searchTerm);
       int resultLength = searchTerm.length();
       System.out.println("The index of your result is " + resultIndex + " and the length is " + resultLength + ".");

       //remove the word and print the sentence again
       String sentenceRemoval = aliceFirstSentenceLowerCase.replace(searchTerm, "");
       System.out.println(sentenceRemoval);










   }
}
