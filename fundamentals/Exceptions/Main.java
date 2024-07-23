// Le code suivant reçois un input qui n'est pas un string,
// une erreur est generé, on va gerer avec une exception

// inputMismatchException est generé en utilisant throws Exception
// mais elle est generique, on doit gerer plus precis l'erreur
package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    // precedement on avaid utilise throws Exception
    // but is not optimal, we gonna manage that independently
    // 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
                    System.out.print("Anne de naissance : ");
                    int yearOfBirth = sc.nextInt();
                    System.out.println(yearOfBirth);

        }
        catch(InputMismatchException e) {
            System.out.println("la dat est iconrrecte, l'erreur ".concat(e.getMessage()));

            // e.printStackTrace(); // POUR DEBUGGER
        } 
        catch(Exception e) {
            
        }
        finally {
            System.out.println("ok");
        }
    }
    
}
