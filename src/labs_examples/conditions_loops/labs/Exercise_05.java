package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integers, smaller number first, space, then larger number: ");
        int lower = scanner.nextInt();
        int upper = scanner.nextInt();

        // decalre a variable to hold the sum of numbers being added
        int sum = 0;
        // declare a variable to count how many numbers do we have between upper and lower bounds
        int counter = 0;

        float avg;

        for (int i = lower; i <= upper; i++) {
            counter += 1;
            sum += i;
        }

        if (counter != 0 && sum != 0) {
            System.out.println("Counter is:" + counter);
            avg = (float) sum/counter;
            System.out.println("The sum is: " + sum);
            System.out.println("The average is: " + avg);
        }
    }
}
