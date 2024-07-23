package Collection.map;

import java.util.Map;
import java.util.TreeMap;

//* TreeMap : pas de doublons, pas thread-safe, accès directe, ordonnée,
// permet les nulls seuelement pour les valeurs

// on passe par un arbre binaire

// accepte null que pour les valeurs
public class TreeMapTest {

    public static void main(String[] args) {
        // String, Float
        // Marc, null

        //
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        tm.put(3, "Marcus");
        tm.put(10, "Caeser");

        System.out.println(tm.get(10));

        // parcourir un tableau avec Map
        for (Map.Entry<Integer, String> ent : tm.entrySet()) {
            System.out.println("cle : " + ent.getKey() + " valeur : " + ent.getValue());
        }
    }

}
