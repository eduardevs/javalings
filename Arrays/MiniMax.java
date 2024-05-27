package projects.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MiniMax {

    static void miniMax(List<Integer> array) {
        // 1. sum all posibilities in the array 
 
        // 2 3 4 5 = 14
        // 1 3 4 5 = 13
        // 1 2 4 5 = 12
        // 1 2 3 5 = 11
        // 1 2 3 4 = 10

        // 2) faire un tableau de resultats
        // trier le max et le min

        // c'est qui le majeur ?
        // minimum = 
        int mini = 0;
        int maxi = 0;
     
        List<Integer> results = new ArrayList<>();

        for(int i = 0; i < array.size(); i++ ) {
            // if index of array item
            for(int j = 0; i < array.size(); j++) {
                if( i != j) {
                    // ! ERROR list int to arrays
                    //results.get(i)+=array[j];
                }
            }
            System.out.println(array.indexOf(i));
            // if(array.indexOf(i) != i) {
            //     results[i]=+i;
            // }
        }
        System.out.println(results.toString());

    }

    public static void main(String[] args) {
        List<Integer> test = Arrays.asList(1,2,3,4,5);
        miniMax(test);
    }
    
}
