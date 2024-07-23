package generiques;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void printList(List<?> li)
    {
        for(Object o : li)
            System.out.println("> "+ o);
    }

    public static void main(String[] args) {
        
        // Fruit f = new Fruit("Pineapple", 19);
        // Vegetable v = new Vegetable("Onion", Color.WHITE);
    

        // Basket<Fruit> bskf = new Basket(f);
        // System.out.println(bskf.getItem().getName());

        // Basket<Vegetable> bskv = new Basket(v);
        // System.out.println(bskv.getItem().getName());

        Fruit f1 = new Fruit("Apple", 2);
        Fruit f2 = new Fruit("Cerise", 10);

        List<Fruit> lf = new ArrayList<>();
        lf.add(f1);
        lf.add(f2);

        printList(lf);

    }
    
}
