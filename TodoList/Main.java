package TodoList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to TodoLister");
        
        Task tasks = new Task();

        tasks.addTask("make homework");
        tasks.addTask("cook breakfast");

        System.out.println(tasks.getTasks());
        

    }

    //
}


// allocation de mémoire pour un tableau
// representation d'un tableau en mémoire
// les données sont stocké de façon contigue (l'une a la suite de l'autre) en mémoire
