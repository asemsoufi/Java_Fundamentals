package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any word: ");
        String urString = scanner.next();

        String word = urString.toLowerCase();
        char firstVowel = '@';
        boolean vowelFound = false;

        int wordLength = word.length();
        int i = 0;

        while(i < wordLength && !vowelFound){
            switch(word.charAt(i)){
                case 'a':
                    firstVowel = 'a';
                    vowelFound = true;
                    break;
                case 'e':
                    firstVowel = 'e';
                    vowelFound = true;
                    break;
                case 'i':
                    firstVowel = 'i';
                    vowelFound = true;
                    break;
                case 'o':
                    firstVowel = 'o';
                    vowelFound = true;
                    break;
                case 'u':
                    firstVowel = 'u';
                    vowelFound = true;
                    break;
            }

            i += 1;
        }

        if(vowelFound){
            System.out.println("The word you entered is: '" + urString + "', and the first vowel in it is: '"
                    + firstVowel + "'");
        }

    }

}
