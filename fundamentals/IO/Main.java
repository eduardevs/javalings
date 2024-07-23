// Scanner 
// asynchrone
// - est monothread mais couteaux car il
// verifie le type de l'input et parse l'input
// BufferedReader 
// - syncrhone et thread-safe
// - solution plus rapide
// - est multithread, 
// - si on veut lire la chaine de caracteres directe sans verifier le type de donnée
// source : https://www.youtube.com/watch?v=fa84_nrUrMw&ab_channel=FormationVid%C3%A9o

package IO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    // throws Exception car Scanner ou BufferedReader peut generer une exception
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Acceder a quel niveau");
        int game_level = sc.nextInt();

        // Scanner verifie le type et parse l'input

        StringBuilder textDisplay = new StringBuilder("Le niveau choisi est "); 
        textDisplay.append(game_level);

        System.out.println(textDisplay);


        // BufferedReader
        // on lui donne un flu  d'entrée comme System.in
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("what's your name ?");
        String name = br.readLine();

        System.out.println(name);


    }
    
}




