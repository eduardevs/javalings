package projects.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountApplesAndOrange {

    /*
     * The function accepts following parameters:
     * 1. INTEGER s
     * 2. INTEGER t
     * 3. INTEGER a
     * 4. INTEGER b
     * 5. INTEGER_ARRAY apples
     * 6. INTEGER_ARRAY oranges
     */

    static void countApplesAndOranges(int s, int t, int a, int b, int qtyApples, int qtyOranges,
            List<Integer> listApples, List<Integer> listOranges) {

                // terrain
                List<Integer> surface = new ArrayList<>();


    }

    public static void main(String[] args) {
        // position of house
        int s = 7;
        int t = 11;
        // position tree 1 and position tree 2
        int a = 3;
        int b = 14;
        //
        // qty apples & oranges
        int qtyApples = 3;
        int qtyOranges = 2;
        // position apples & oranges falls
        List<Integer> listApples = Arrays.asList(-2, 2, 1);
        List<Integer> listOranges = Arrays.asList(5, -6);

        countApplesAndOranges(s, t, a, b, qtyApples, qtyOranges, listApples, listOranges);
    }
}
