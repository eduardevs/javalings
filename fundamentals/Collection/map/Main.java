package Collection.map;
/* tableaux associatifs (clé vlaleur)
 * HashMap : pas de doublons (sauf valeur), pas thread-safe, accès direct, valeurs nulles /
 * (jusqu'à une clé "null et eventuellement plusieurs valeurs "null")
*/


// hashMap peut avoir null comme valeur et clé (une seule clé)
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<String, String>();

        hm.put("1", "Jesus");
        hm.put("2", "Adam");
        hm.put("3", "Jose");

        System.out.println(hm.get("3"));
        // System.out.println(hm.get("15")); // -> null

        if(hm.containsKey("3")) {
            System.out.println("trouvee");
        }

        // keySet -> retourner l'ensemble de clés
        for(String k : hm.keySet())
            System.out.println(k);


    }
}
