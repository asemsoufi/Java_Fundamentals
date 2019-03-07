package labs_examples.datatypes_operators.labs;

import java.util.Scanner;

/**
 * Please demonstrate the use of all arithmetic operators below. These include:
 *
 * addition, subtraction, multiplication, division and modulus
 *
 */
class ArithmeticOperators {

    public static void main(String[] args) {

        // write your code below
        float price = 30f;
        float shipping = 6f;
        float vat = price * 0.2f;
        float cost = price + shipping + vat;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter how much you are going to pay: $");
        Float payment = input.nextFloat();

        float change = payment - cost;

        if(payment%cost == 0) {
            System.out.println("The cost of your item is: $" + cost + ", " +
                    "you paid the exact amount of your purchase.");
        }
        else {
            System.out.println("The cost of your item is: $" + cost + ", you paid $" + payment +
                    ", and your change is $" + change);
        }

        System.out.println("Thanks for your business!");
    }

}
