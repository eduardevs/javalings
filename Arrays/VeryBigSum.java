package projects.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VeryBigSum {
    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        // 1 operation
        List<Long> sumTotal = new ArrayList<>(1);
        
        long total = ar.get(0);

        System.out.println(sumTotal);

        for (int i = 1; i < ar.size(); i++) {
            // sumTotal += ar[i];
            total+=ar.get(i);
        }

        System.out.println(total);

        // array
        // 2 operation
        return 0;
    }

    public static void main(String[] args) {
       

        List<Long> bigSum = Arrays.asList( 1000000001L,1000000002L, 1000000003L, 1000000004L, 1000000005L);
        long test = aVeryBigSum(bigSum);
    }

}
