package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {

        float[] arraysCalc = new float[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        for(int i = 0; i < 10; i++){
            arraysCalc[i] = scanner.nextFloat();
        }

        float sum = 0;
        for(float num : arraysCalc){
            sum += num;
        }

        System.out.println("the sum of the numbers you entered is: " + sum +
                    ", and the average is: " + sum/10);

    }

}