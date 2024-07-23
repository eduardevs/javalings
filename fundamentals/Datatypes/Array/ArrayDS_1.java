package Datatypes.Array;

//import java.util.Array;

// RAPPEL : lecture tip -> int[] tab (tab is array of int - from right to left)


public class ArrayDS_1 {
    // add method printab
    public static void printTab(int[] t) {
        for (int element : t) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        int[] tab = { 1, 2, 3, 4, 5 };

        printTab(tab);

        //tab.toString()
    }
}

// 3.
/*
 * 
 * Object : equals, toString
 * class Array
 * 
 */
