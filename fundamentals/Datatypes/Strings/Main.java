// https://info.clg.qc.ca/java/chaines/string-builder

// La traitement de strings en java est couteaux (quand on utilise +), pour le traitement de string on a 
// une serie de classes muables et pas inmuable comme string, qui permet des operations
// comme (append, preprend, split,.. )

package Datatypes.Strings;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        // String : immuable -> non modifiable

        // length
        // concat : plus rapide que +
        // toUpperCase, toLoxwerCase, trim, replace(old, new)
        // charAt()
        // substring(index, nb)
        // equals(<str>), compareTo(<str>) : compare the ascii value
        String test = "hello";
        
        System.out.println(test.concat(" world").concat(test));





        // 2 
        // a utiliser seulement quand on travaille en multithread
        StringBuffer sBuffer = new StringBuffer();

        // a utiliser en monothread (la plus part de cas)
        StringBuilder sBuilder = new StringBuilder("Hello Monde");

        sBuilder.append(" et a todos!").toString();

        System.out.println(sBuilder);

        // split,
        StringTokenizer stringTest;


    }
}



// TODO: difference entre stringTokenizer et stringbuilder
