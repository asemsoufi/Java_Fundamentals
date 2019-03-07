package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        // write code here
        float h = 5f;
        float r = 3.14f;
        double volume = Math.PI * (r * r) * h;
        double surface = Math.PI * 2 * r * h;

        System.out.println("We have a cylinder with a radius of 3.14 and a height of 5.");
        System.out.println(" The volume of this cylinder is " + volume);
        System.out.println(" The surface of this cylinder is " + surface);


    }
}
