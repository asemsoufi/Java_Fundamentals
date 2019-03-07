package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {

    public static void main(String[] args) {

        int luckyNumber = 11;

        Scanner scanner = new Scanner(System.in);

        int numTried = 0;

        while(true){
            System.out.print("Guess an integer between 1 and 20: ");
            numTried += 1;
            int userInput = scanner.nextInt();
            if(userInput == luckyNumber){
                break;
            }
        }

        System.out.println("Nice play, it took you " + numTried + " times to guess the right number!");

    }
}
