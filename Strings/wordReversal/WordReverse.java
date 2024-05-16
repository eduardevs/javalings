package projects.Strings.wordReversal;

import java.util.ArrayList;

public class WordReversalTest {
    
    static String reverse(String string) {

        // char[] tabWords = string.toCharArray();
        // ici faire l'operation de ajouter majuscule et detecter s'il y a des
        // characteres specexiaux (!?)
        // https://stackoverflow.com/questions/12130776/slice-string-in-java
        String mutatedString = string;
        String testString = null;
        String specialChar = null;

        if (string.endsWith("!")) {
            specialChar = string.substring(string.length() - 1);
            // System.out.println(special);
            testString = mutatedString.substring(0, string.length() - 1);
        }

        if (string.endsWith("?")) {
            specialChar = string.substring(string.length() - 1);
            // System.out.println(special);
            testString = mutatedString.substring(0, string.length() - 1);
        }

        if (testString != null) {
            mutatedString = testString;
        }

        /* TO CONVERT STRING INTO ARRAY 
         * - split()
         */
        String[] arr = mutatedString.split(" ");

        ArrayList<String> reversedArray = new ArrayList<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArray.add(arr[i]);
        }

        String joinedString = String.join(" ", reversedArray);
        String oldChar = joinedString.substring(0, 1);
        String newChar = oldChar.toUpperCase();

        String formatedString = joinedString.replace(oldChar, newChar);

        String result = formatedString;
        if(specialChar != null) {
            result = formatedString.concat(specialChar);
        }


        return result;
    }

    public static void main(String[] args) {
        String phrase = "Codecademy is the best!";
        String result = reverse(phrase);
        System.out.println(result);
    }
}
