package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        System.out.println("3 times 4 equals " + multiply(3,4));
        System.out.println("18 divide 9 equals " + divide(18,9));

        System.out.println("My favorite joke is: ");
        joke();

        System.out.println();

        System.out.println("There are " + secondsInYears(2) + " seconds in 2 years.");

        System.out.println();


        System.out.println("There are " + attendees("luthar", "Asem") + " people attending tonight's party.");


        System.out.println("it's going to be fun :)");


    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    static int multiply(int a, int b){
        return a * b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    static int divide(int a, int b){
        return a / b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    static void joke(){
        System.out.println("There are 10 types of people: those who know binary, and those who don't!");
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    static int secondsInYears(int a){
        return a * 365 * 24 * 3600;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    static int attendees(String... persons){
        return persons.length;
    }

}
