package projects;

public class NaturalNumber {
    public static int sumOfNatural(int n) {
        int sum = n * (n + 1) / 2;

        return sum;
    }

    public static void main(String[] args) {
        int n = 10;

        int total = sumOfNatural(10);
        System.out.println(total);
    }


}
