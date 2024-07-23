package Collection.file.PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {
    // queue, dequeue -> system doublement chainé

    // 1 - PriorityQueue
    // ordonnée, accepte doublons, refuse valeurs nulles, PAS thread-safe
    // FIFO : premier entrée, premier sortie
    // pas de valeur null sinon exception sera lévée
    // un cas avec un certain ordre, qui ne garantit pas un ordre précis,
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(100);
        pq.add(-4);
        pq.add(50);
        pq.add(140);
        pq.add(400);

        // pas d'ordre, l'ordre choisi lors de l'execuion duc ode :
        // -4
        // 100
        // 50
        // 140
        // 400

        Iterator it = pq.iterator();

        while (it.hasNext())
            System.out.println(it.next());

        //OPERATIONS
        // pour trouver un element,
        // il faudra utiliser un comparator
        // chaines de caracters, mais pour trouver une entité c'est plus compliqué
        // seulement de types natifs, qui implemente comparable sont injectables dans la
        // classe


        // pq.add(new Player("jason", 3)); // error comparable ...
        // pq.peek() // pour recuperer l'element en haut du sommet
        // pq.poll() // retirer celui qui est en premier
        // element()
    }
}
