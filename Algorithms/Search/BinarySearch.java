package projects.Algorithms.Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    // changer a public

    // [lo + (hi-lo)/2]
    static Boolean find(List<Integer> arr, int needle) {
        int high = arr.size();
        int low = 0;

        do {
            int half = (int) Math.floor(low + (high - low) / 2);
            int value = arr.get(half);

            if(needle == value) {
                return true;
            } else if (value > needle) {
                high = half;
            } else {
                low = half+1;
            }

        } while (low < high);

        return false;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        boolean result = find(numbers, 5);
        System.out.println(result);
    }


}
