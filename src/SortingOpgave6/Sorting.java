package SortingOpgave6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorting {

    public void sortWords(String word1, String word2, String word3, String word4, String word5){
        ArrayList<String> words = new ArrayList<String>();
        words.add(word1);
        words.add(word2);
        words.add(word3);
        words.add(word4);
        words.add(word5);

        Collections.sort(words, Collections.reverseOrder());

        for (String word : words) {
            System.out.println(word);

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sorting sorting = new Sorting();

        System.out.println("Let's sort five words of your choice!");
        System.out.println("Please type your first word:");
        String word1Input = scanner.next();

        System.out.println("Please type your second word:");
        String word2Input = scanner.next();

        System.out.println("Please type your third word:");
        String word3Input = scanner.next();

        System.out.println("Please type your four word:");
        String word4Input = scanner.next();

        System.out.println("Please type your fifth word:");
        String word5Input = scanner.next();


        System.out.println("Here is your words sorted in reverse: \n");
        sorting.sortWords(word1Input, word2Input, word3Input, word4Input, word5Input);

    }
}
