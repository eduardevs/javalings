package projects.Test;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

    static List<Integer> generateArray(int from, int to) {
        List<Integer> listNumbers = new ArrayList<>();

        for (int i = from; i <= to; i++) {
            listNumbers.add(i);
        }
        return listNumbers;
    }

    public static void main(String[] args) {
        List<Integer> array = generateArray(1, 100);
        System.out.println(array.toString());
    }
}
