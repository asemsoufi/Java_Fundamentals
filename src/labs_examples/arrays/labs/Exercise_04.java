package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate an irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int[][] irregArray = {
                {546, 23},
                {123, 345, 87},
                {345, 87, 907, 45}
        };

        // the following counters are used solely for the purpose of formatting the printout,
        // i.e. when and how to print curly brackets and colons.
        int outerCounter = 0;
        int innerCounter = 0;

        for(int[] innerArray : irregArray){
            outerCounter++;
            System.out.print("{");
            for(int num : innerArray){
                innerCounter++;
                if(innerCounter < innerArray.length) {
                    System.out.print(num + ",");
                }
                else{
                    System.out.print(num);
                }
            }
            innerCounter = 0;
            if(outerCounter < irregArray.length) {
                System.out.print("},");
            }
            else{
                System.out.print("}");
            }
        }

    }

}
