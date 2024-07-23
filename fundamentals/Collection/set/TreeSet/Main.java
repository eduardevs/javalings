package Collection.set.TreeSet;

import java.util.TreeSet;

/*  
   2.TreeSet (arbre binaire) : pas de doublons, pas thread-safe, ordonnée, pas d'acces direct


   3. Set, SortedSet

    1. ici on trouvera des classes et methodes de maps
    2. ici d'arbres

    OPERATIONS -> TRÈS rapide pour HashSet
    - on aura un coup constant
    - tout les 2 implemente equals, hashCode
    - headSet ->
*/

// TreeSet
// arbres black red - red black
// rotations pour bien s'equilibrer

//imeplemnter dans treeSet : compare, compareTo
// les elements sont triés. (ordre naturel)
// comment trier des joueurs (Player)
// le but se de trier, (on lui disant la regle par rapport aux classes, nombres,)
// TreeSet sera plus long au niveau des operations

// hashSet garantit par d'ordre, hashcode sur des index (relative)
public class Main {

    // si on veut pas trier, on choisit hashSet, pour trier choisir TreeSet
    // avec des données un peu partciuliere implemente compare, compareTo

    public static void main(String[] args) {

        TreeSet<Integer> hs = new TreeSet<Integer>();
        hs.add(15);
        hs.add(20);
        hs.add(1);
        hs.add(-1);
        hs.add(155);
        hs.add(-300);

        // tailSet
        // tailSet(-4, 355);
        // https://www.geeksforgeeks.org/treeset-tailset-method-in-java/

        // headSet
        System.out.println(hs.headSet(1));

        System.out.println("Ordered set: " + hs);
        // extraire de sous-ensemble, on part de la tete et on s'arrete
        // from A to B -> le max est exclu

        // subSet() extraction des elements

    }

}
