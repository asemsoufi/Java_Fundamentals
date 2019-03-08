package labs_examples.arrays.labs;


import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer between 1-10: ");
        int userNum = scanner.nextInt();

        // declare an int to hold the index of the number entered by the user, if it exists in the array
        int index = -1;

        for(int i = 0; i < array.length; i++){
            if(userNum == array[i]){
                index = i;
                break;
            }
        }

        System.out.println("In JAVA terms, the number " + userNum + " is at index " + index + " of the array.");

        if (index == 0) {
            System.out.println("In other words, the number " + userNum + " is the first element in the array.");
        } else if (index == 1) {
            System.out.println("In other words, the number " + userNum + " is the second element in the array.");
        } else if (index == 2) {
            System.out.println("In other words, the number " + userNum + " is the third element in the array.");
        } else {
            System.out.println("In other words, the number " + userNum + " is the " + (index+1) +
                    "th element in the array.");
        }

    }
}