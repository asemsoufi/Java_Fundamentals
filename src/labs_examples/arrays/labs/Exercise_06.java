package labs_examples.arrays.labs;

/**
 *  Reversing an array in place
 *
 *
 *      This is a very common interview challenge.
 *
 *      Using a for loop, please demonstrate how to reverse an array in place using only one extra variable. Please note,
 *      you cannot use a second array and you can only instantiate one variable outside of the for loop.
 *
 */
public class Exercise_06 {

    public static void main(String[] args) {

        int[] array = {11,10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Original array elements:");
        for(int num : array){
            System.out.print(num + " ");
        }

        int temp = array[0];

        for(int i = 0; i < array.length/2; i++){
            array[i] = array[array.length - (1 + i)];
            array[array.length - (1 + i)] = temp;
            temp = array[i+1];
        }

        System.out.println("\nElements in reversed order:");
        for(int num : array){
            System.out.print(num + " ");
        }

    }
}
