package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    static Integer[] reverseArray(int[] tab) {
        ArrayList<Integer> reverseTab = new ArrayList<>();

        for (int j = tab.length - 1; j >= 0; j--) {
            reverseTab.add(tab[j]);
        }

        /*
         * TO CAST ArrayList into Integer of Array
         * - Using method toArray(new Integer[0])
         * https://stackoverflow.com/questions/29368480/returning-array-contents-instead
         * -of-memory-address
         */
        return reverseTab.toArray(new Integer[0]);
    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>(2); // Initialize the array

        result.add(0);
        result.add(0);

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                result.set(0, result.get(0) + 1);
            } else if (a.get(i) < b.get(i)) {
                result.set(1, result.get(1) + 1);
            }
        }


        return result;
    }

    static int[] compareArrays(int[] a, int[] b) {
        Integer[] reorderTab = reverseArray(b);

        System.out.println(Arrays.toString(reorderTab));

        // cast arrayList to int[]

        // ArrayList<Integer> result = {0, 0};
        // Integer[] result = {0, 0};
        // // comparer : linearsearch
        // for (int i = 0; i < a.length; i++) {
        // if (a[i] > reorderTab[i]) {
        // result[0] = result[i]+1;
        // } else if (a[i] < reorderTab[i]) {
        // System.out.println(result[1]);
        // result[1] = result[i]+1;
        // }
        // }
        int[] result = new int[2]; // Initialize the array

        for (int i = 0; i < a.length; i++) {
            System.out.println(reorderTab[i]);
            System.out.println(a[i]);
            if (a[i] > reorderTab[i]) {
                System.out.println("a wins");

                result[0]++; // Increment the count for a[i] > reorderTab[i]
            } else if (a[i] < reorderTab[i]) {

                System.out.println("b wins");
                result[1]++; // Increment the count for a[i] < reorderTab[i]
            }
        }

        return result;

    }

    public static void main(String[] args) {
        // int[] a = { 4, 0, 4 };
        // int[] b = { 1, 2, 3 }; // 4, 0, 4

        // int[] results = compareArrays(a, b);

        // // System.out.println(Arrays.toString(results));

        // List Intteger
        List<Integer> d = Arrays.asList(1, 2, 3);
        List<Integer> c = Arrays.asList(3, 2, 1);

        List<Integer> resultList = compareTriplets(c, d);
        System.out.println(resultList);

        /*
         * TO DISPLAY ARRAY :
         * a) Array.toString(<array>);
         * IF NOT, memory adresses of array elements will be displayed
         * 
         * b) DISPLAY EACH ITEM =>
         * for(Integer result : results) {
         * System.out.println(result);
         * }
         * 
         * Explanation : You can't return anything but the address because what you can
         * return is only one value
         */

    }
}
