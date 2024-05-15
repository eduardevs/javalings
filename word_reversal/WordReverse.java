import java.util.ArrayList;

public class WordReverse {

    public String reverse(String string) {

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

    public String reverseTest(String string) {
        // amigos somos
        StringBuilder stringTest = new StringBuilder();

        StringBuilder stringC = stringTest.append(string);

        // strA
        // strC
        Character space = ' ';

        //
        // int counter;
        // for(char c : string.toCharArray()) {

        // System.out.println(c);
        // if(c == string[])) {

        // }
        // // if(c.equals(" ")) {
        // // counter++;
        // // }
        // }
        // string = "hola";

        System.out.println(string.indexOf(" "));

        // * THIS WAY OF LOOPING TRHOUGH STRING WORKS
        // to store the indexes in an array of the spaces
        ArrayList<Integer> listOfSpaces = new ArrayList<>();

        // COMPARE CHARACTERS OF STRING WITH ONE CHAR
        for (int i = 0; i < string.toCharArray().length; i++) {
            if (string.toCharArray()[i] == space) {
                listOfSpaces.add(i);
            }
            ;
        }

        // System.out.println(listOfSpaces.toString());

        // * 2 split to make reverse the phrase
        StringBuilder newPhrase = new StringBuilder();
        char[] tabWords = {};

        for (int element : listOfSpaces) {
            tabWords = string.toCharArray();
            // newPhrase.append(string);
        }
        System.out.println(tabWords);

        return "";
    }

}
