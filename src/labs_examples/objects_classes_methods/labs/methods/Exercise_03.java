package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.Character.toLowerCase;

class Example_Ex03 {

    public static void main(String[] args) {

        // 1) example
        MethodTraining.printString("Asem");
        MethodTraining.printString("Hadeel",3);
        System.out.println();

        // 2) example
        

        // 3) example
        System.out.println("largest number among: 1,45,7,89 is: " + MethodTraining.largestNum(1,45,7,89));
        System.out.println();

        // 4) example
        System.out.println("There are " + MethodTraining.consonants("Hello World") +
                " consonants in Hello World.");
        System.out.println();

        // 5) ASCII art example
        MethodTraining.drawSolidSquare(14);

        // 6) example
        System.out.println("Is 79 a prime number: " + MethodTraining.isPrime(79));
        System.out.println();

        // 7) example
        int[] exampleArray = {23,5,67,9,87,4,5,12,44};
        System.out.println("The highest and lowest numbers in the array: " + Arrays.toString(exampleArray) +
                " are: " + Arrays.toString(MethodTraining.minMaxArray(exampleArray)));

        System.out.println();

        // 8) example
        ArrayList<Integer> example8ArrayList = MethodTraining.divArraylist(30,2,3);
        System.out.println("Between 0 and 30, there are " + example8ArrayList.size() +
                " divisible numbers by both 2 and 3. \nThese numbers are: " +
                        example8ArrayList.toString());

        System.out.println();

        // 9) reverse array
        int[] anArray = {11,10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Reversing the array: " + Arrays.toString(anArray) + " ...");
        MethodTraining.reverseArray(anArray);
        System.out.println("The reversed array is: " + Arrays.toString(anArray));

    }

}

class MethodTraining {

    // 1) method overloading
    public static void printString(String string){
        System.out.println("Your string is: " + string);
    }

    // overloading
    public static void printString(String string, int numOfprints){
        System.out.println("Your string (" + string + ") will print " + numOfprints + " times:");
        for(int i = 1; i <= numOfprints; i++){
            System.out.println(string);
        }
    }

    // 3) return the largest of 4 numbers
    public static int largestNum(int a, int b, int c, int d) {
        int[] numList = {a,b,c,d};
        int largest = a;
        for (int num : numList){
            if (num > largest){
                largest = num;
            }
        }
        return largest;
    }

    // 4) count all consonants in a string
    public static int consonants(String someString){
        char[] charList = someString.toCharArray();
        int counter = 0;
        for(char c : charList){
            c = toLowerCase(c);
            if((c  != 'a') && (c  != 'e') && (c  != 'i') && (c  != 'o') && (c  != 'u') && (c!=' ')){
                counter += 1;
            }
        }
        return counter;
    }

    // 5) ASCII art example
    public static void drawSolidSquare(int width){
        for(int j = 1; j <= width+2; j++){
            System.out.print('#');
        }
        System.out.println();
        for(int i = 1; i <= width/2; i++){
            System.out.print('#');
            for(int j = 1; j <= width; j++){
                System.out.print('*');
            }
            System.out.print('#');
            System.out.println();
        }
        for(int j = 1; j <= width+2; j++){
            System.out.print('#');
        }
        System.out.println("\n");
    }

    // 6) determine whether or not a number is prime
    // here I'm using the Pseudocode found on Wikipedia:
    // https://en.wikipedia.org/wiki/Primality_test#Pseudocode
    public static boolean isPrime(int number){
        if (number <= 3){
            return number >= 1;
        }
        else if(number % 2 == 0 || number % 3 == 0){
                return false;
            }

        else{
            int i = 5;
            while (i * i <= number) {
                if (number % i == 0 || number % (i + 2) == 0) {
                    return false;
                }
                i += 6;
            }
            return true;
        }
    }

    // 7)return a small array containing the highest and lowest numbers in an array of numbers
    public static int[] minMaxArray(int[] numArray) {
        int[] smallArray = new int[2];
        int largest = numArray[0];
        int smallest = numArray[0];
        for (int num : numArray){
            if (num > largest){
                largest = num;
            }
            else if (num < smallest){
                smallest = num;
            }

            smallArray[0] = largest;
            smallArray[1] = smallest;
        }

        return smallArray;
    }

    // 8)
    public static ArrayList<Integer> divArraylist(int maxNum, int divisor1, int divisor2){
        ArrayList<Integer> tempArrayList = new ArrayList<Integer> ();
        for(int num = 0; num <= maxNum; num++){
            if((num % divisor1 == 0) && (num % divisor2 == 0)){
                tempArrayList.add(num);
            }
        }

        return tempArrayList;
    }

    // 9) reverse an array
    public static void reverseArray(int[] intArray){
        int temp = intArray[0];
        for(int i = 0; i < intArray.length/2; i++){
            intArray[i] = intArray[intArray.length - (1 + i)];
            intArray[intArray.length - (1 + i)] = temp;
            temp = intArray[i+1];
        }
    }
}
