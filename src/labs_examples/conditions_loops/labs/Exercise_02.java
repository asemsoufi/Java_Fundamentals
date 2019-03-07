package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner
        Scanner scanner = new Scanner(System.in);
        // 2) prompt user
        System.out.print("Enter an integer: ");
        // 3) assign input to variable as int
        int num = scanner.nextInt();
        // 4) write completed code here
        if(num == 1){
            System.out.println("The day is Monday.");
        } else if(num == 2){
            System.out.println("The day is Tuesday.");
        } else if(num == 3){
            System.out.println("The day is Wednesday.");
        } else if(num == 4){
            System.out.println("The day is Thursday.");
        } else if(num == 5){
            System.out.println("The day is Friday.");
        } else if(num == 6){
            System.out.println("The day is Saturday.");
        } else if(num == 7){
            System.out.println("The day is Sunday.");
        } else {
            System.out.println("The day is some Other day.");
        }

    }
}
