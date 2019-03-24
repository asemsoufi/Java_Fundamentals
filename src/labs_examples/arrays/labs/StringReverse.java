package labs_examples.arrays.labs;

public class StringReverse {

    public static String reversed(String arg){
        String reversedString = "";
        char[] argString = arg.toCharArray();
        for(int i = argString.length -1; i <= 0; i++){
            reversedString += argString[i];
        }
        return reversedString;
    }
}
