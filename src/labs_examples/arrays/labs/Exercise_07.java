package labs_examples.arrays.labs;


import java.util.ArrayList;


/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {

        ArrayList<String> colorList = new ArrayList<>();

        colorList.add("Blue");
        colorList.add("White");
        colorList.add("Red");
        colorList.add("Black");
        colorList.add("Yellow");
        colorList.add("Green");
        colorList.add("Brown");

        for (String s : colorList){
            System.out.print(s + " ");
        }

        // adding another color to the list
        colorList.add("Magenta");

        // removing Brown the list
        colorList.remove("Brown");
        System.out.print("\nThe current list has " + colorList.size() + " colors: ");

        for (String s : colorList){
            System.out.print(s + " ");
        }

        System.out.println();

        if(colorList.contains("Blue")){
            System.out.println("My favorite color, Blue, is in the list.");
        }
        else{
            System.out.println("Blue needs to be added to the list.");
        }

    }
}
