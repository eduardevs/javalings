package Collection.set;

import java.util.HashSet;
import java.util.TreeSet;

/*  
   1.HashSet (basé sur une table d'hachage) : pas de doublons, pas thread-safe, acces direct
   2.TreeSet (arbre binaire) : pas de doublons, pas thread-safe, ordonnée, pas d'acces direct


   3. Set, SortedSet

    1. ici on trouvera des classes et methodes de maps
    2. ici d'arbres

    OPERATIONS -> TRÈS rapide pour HashSet
    - on aura un coup constant
    - tout les 2 implemente equals, hashCode
    - headSet ->

    * hashcode :l'identifiant de l'information
    parce que la verification se fait :*/

// Set doit pas accepter des doublons
// lors qu'on utilise une Classe Entity pour eviter des doublons il faut implementer hashCode, equals
// pour verifier des doublons

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

        // niveau de charge, si la capcité est proche d'etre attendu,
        // on peut agrandir la capacité
        // 50, 0.6
        // HashSet<Integer> hs = new HashSet<Integer>(50, 0.6);
        // a 60% l'instance de la classe sera agrandit

        TreeSet<Integer> hs = new TreeSet<Integer>();
        hs.add(15);
        hs.add(20);
        hs.add(1);
        hs.add(-1);
        hs.add(155);
        hs.add(-300);

        // tailSet
        


        // extraire de sous-ensemble, on part de la tete et on s'arrete
        // from A to B -> le max est exclu

   

    }

}
// hashSet ===== hashCode, equals
// TreeSet ===== compare, compareTo
