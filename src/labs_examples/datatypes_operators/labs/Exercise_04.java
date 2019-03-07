package labs_examples.datatypes_operators.labs;


import java.util.Scanner;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        if (a < b){
            System.out.println("a is less than b");
        }

        // write your code below

        // getting two numbers from he user to compare،
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers to evaluate: ");
        Float num1 = input.nextFloat();
        Float num2 = input.nextFloat();
        System.out.println("You entered, " + num1 + ", and " + num2);

        if (num1 < num2){
            System.out.println("first number is less than second number.");
        }
        else if (num1 > num2){
                System.out.println("first number is greater than second number.");
        }
        else {
            System.out.println("first number and second number are equal.");
        }

        // play a quick guessing game, the number to guess is preset to 50

        System.out.print("Guess an integer between 1 and 99: ");
        int guess = input.nextInt();

        if (guess == 50){
            System.out.println("Wow, you did it!");
        }

        else if ((guess - 50) >= 10){
            System.out.println("Oops, you aimed too high!");
        }

        else if ((guess - 50) <= -10){
            System.out.println("Oops, you aimed too low!");
        }

    }

}

