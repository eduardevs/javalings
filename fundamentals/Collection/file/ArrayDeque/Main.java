package Collection.file.ArrayDeque;

import java.util.ArrayDeque;
// ArrayDeque
// ordonnée, accepte doublons, refuse valeurs nulles, PAS thread-safe
import java.util.Iterator;


// avantages de la liste doublement chainé
// array  -> de liste ; deque -> file doublement chainé
// utilisable pour une liste chainé ou une pile.
// USAGE :
public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<Integer>();
        

        //OPERATIONS
        adq.addFirst(4);
        adq.addFirst(15);
        adq.addFirst(0);

        //offerFirst
        adq.offerFirst(null);
        //pollFirst
        // pollLast
        // peekFirst, peekLast

        adq.removeFirst();

        // addLast(4);addLast(5);addLast(4)
        // deletes last item value 4 = removeLastOcurrence(4)
        // capacity
        Iterator it = adq.iterator();

        while(it.hasNext())
            System.out.println(it.next());
        
        System.out.println(adq.getFirst());
        
            // respecte un peu l'ordre naturel
            // ? ArrayDeque :
            // * pour faire des piles est plus efficace avec ArrayDequ
            // * c'est pas Thread-SAFE comme STACK -> 
            // * USAGES :liste chainé, ou piles
            // * les methodes peuvent lever des exceptions -> utiliser des try catchs
    
            // pour avoir comportement de PILE
            // addFirst() -> push
            // removeFirst -> po
            // peekFirst() -> retourner le sommet
        
            // ! DANS UN ENVIRONMENT MONOTHREADÉ L'USAGE DE ARRAYDEQUE EST PLUS RAPIDE POUR FAIRE DE PILES (STACK) QUE D'UTILISER la class STACK QUI EST POUR MULTITHREADÉ.
        }   
    
}
