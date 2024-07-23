package Collection.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class MainTwo {
    // INSERTION TRES RAPIDE
    /// au debut, a la fin de la chaine
    // dans arraylist ce sera un parcourir pour decaler, faire l'emplacement et rjaouter, ce qui est plus complexe
    // LinkedList est fait pour l'insertion plus efficace


    // addFirst
    // addLast
    // getFirst, getLast
    // removeLast

    // 3. ITERATOR : (parcourir une collection : cursor en db) conçu pour parcourir en JAVA.
    // c'est mieux que d'utiliser la boucle, car c'est optimisé pour cela.
    // ListIterator
    // il fonctionne par iteration,
    public static void main(String[] args) {
        
        LinkedList<Cat> group = new LinkedList<Cat>();

        Cat c1 = new Cat("Pepe");
        Cat c2 = new Cat("Mencho");
        Cat c3 = new Cat("dina");
        Cat c4 = new Cat("Kito");

        group.addFirst(c1);
        group.addFirst(c2);
        group.addFirst(c3);
        group.addFirst(c4);

        // creation d'ITERATOR
        ListIterator<Cat> lit = group.listIterator();

        // verifier un elemnt
        // if(lit.hasNext())
        //    lit.next().meow();
        while(lit.hasNext())
            lit.next().meow();
        // for (Cat el : group)
        //     el.meow();


    }
    
}
