package Collection.list;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
    // ArrayList : mono-thread, accès directe, optimisé pour lecture
    // LinkedList : accès pas directe, facile écriture
    // Vector : multi-thread, optimisé pour lecture
    // Stack : LIFO, thread-safe (multi-thread)
  

    // add, remove, clear, get (pas sur linkedList car il faut parcourir un tas de choses)
    // size, capacity->vector

    public static void main(String[] args) {

        // pour instancier arraylist on peut pas declarer de type primitive
        ArrayList<Cat> group = new ArrayList<Cat>();

        Cat c1 = new Cat("Pepe");
        Cat c2 = new Cat("Mencho");
        Cat c3 = new Cat("dina");
        Cat c4 = new Cat("Kito");

        group.add(c1);
        group.add(c2);
        group.add(c3);
        group.add(c4);

        for (Cat el : group)
            el.meow();

        // acceder
        // System.out.println(group.get(0));
        // va print l'adresse de l'objet dans le tableau

        // * remove
        group.remove(1);

        for (Cat el : group)
            el.meow();


        // Collections.sort(group);
        // comparaison d'objet later to sort
    }

}
