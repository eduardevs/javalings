package Datatypes.Array;
// here we will see the uses of packages arrays
import java.util.Arrays;

public class ArrayDS_2 {
    public static void main(String[] args) 
    {
        int[] tab = new int[10];

        // class utilitaire - pour utiliser des méthodes statiques/utilitaires
        Arrays.fill(tab, 15);

        for(int el : tab)
            System.out.println(el);
    }
}


// java est très riches par rapport au libraries et utilisateirs qu'on peut utiliser (collections).