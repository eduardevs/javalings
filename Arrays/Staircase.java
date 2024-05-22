package projects.Arrays;

public class Staircase {

    static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            
            for(int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        staircase(4);
    }
}
