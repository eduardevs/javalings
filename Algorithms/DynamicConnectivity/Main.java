package projects.dynamic_connectivity;

public class Main {

    public static void main(String[] args) {
        //1- find
        QuickFindUF test = new QuickFindUF(5);
        test.union(1,4);
        test.union(1,2);
        System.out.println(test.connected(0, 4));

        // 2- union()
        
    }
}
