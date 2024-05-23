package projects.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        // counters :
        int totalElements = arr.size();
        int counterPos = 0;
        int counterNeg = 0;
        int counterZero = 0;

        for(int item = 0; item < totalElements; item++) {
            if(arr.get(item) > 0) {
                counterPos++;
            } else if(arr.get(item) < 0) {
                counterNeg++;
            } else {
                counterZero++;
            }
        }

        // CALCULER %
        int ratio = 1;

        float ratioPos = (float) counterPos * ratio / totalElements; 
        float ratioNeg = (float) counterNeg * ratio / totalElements; 
        float ratioZero = (float) counterZero * ratio / totalElements; 

        System.out.printf("%.6f\n",ratioPos);
        System.out.printf("%.6f\n",ratioZero);
        System.out.printf("%.6f\n", ratioNeg);
        
    }

    public static void main(String[] args) {
        List<Integer> test1 = Arrays.asList(-4, 3, -9, 0, 4, 1);

        plusMinus(test1);
    }

}
