package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */


/* How to determine whether a year is a leap year
To determine whether a year is a leap year, follow these steps:
1- If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
2- If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
3- If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
4- The year is a leap year (it has 366 days).
5- The year is not a leap year (it has 365 days). */

public class Exercise_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two years and i will list all leap years in between.\nStart with the smaller: ");
        int firstYear = scanner.nextInt();
        int lastYear = scanner.nextInt();

        int leapYearCounter = 0;

        System.out.println("\n" + "Here is the result:");

        for(int thisYear = firstYear; thisYear <= lastYear; thisYear++){
            if(thisYear % 4 != 0) {
                continue;
            }
            else{
                if(thisYear % 100 == 0){
                    if(thisYear % 400 == 0){
                        System.out.print(thisYear + "|");
                        leapYearCounter += 1;
                    }

                } else{
                    System.out.print(thisYear + "|");
                    leapYearCounter += 1;
                }
            }
        }

        System.out.println("\n");
        System.out.println("So, there are " + leapYearCounter + " leap years between " + firstYear + " and " + lastYear + ".");
    }
}
