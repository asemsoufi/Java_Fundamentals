package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;

        if (a | b){
            System.out.println("a | b is True, because either a or b is true, but I can't tell which!");
        }
        System.out.println();

        // write your code below

        if (a || b){
            System.out.println("a || b is True! because a is true, " +
                    "but I'm not sure about b as it was never evaluated!");
        }
        System.out.println();
        System.out.println("Using NOT to force the printing of the following:");
        if (!(a & b)){
            System.out.println("a & b is False! " +
                    "After checking both a & b and finding them to be contradictory.");
        }
        System.out.println();

        if (!(a && b)){
            System.out.println("Using NOT to force the printing of the following:");
            System.out.println("a && b is False! " +
                    "After checking a first and finding it to be true, " +
                    "I then moved to check b but it was false!");
        }
        System.out.println();

        if (a ^ b){
            System.out.println("a XOR b is True! because only one of them is true.");
        }


    }

}

