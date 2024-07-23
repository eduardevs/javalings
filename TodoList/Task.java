package TodoList;

import java.util.ArrayList;
import java.util.List;

public class Task {
    // array are not updatetable
    // we define size
    //private String[] tasks = new String[3];
    private List<String> tasks = new ArrayList<>();

    public Task () {
    }
    public List<String> getTasks(){
        //System.out.println("size array is : "+this.tasks.length);
        // ! problem arrive quand on veut retourner l'array; l'array retourne valeurs et references
        // reference est l'adresse de la variable alloué en mémoire de façon contigue pour les tableaux
        //  for(String task : this.tasks) {
        //     return task;
        //  }
       // return this.tasks;

       // * GOOD
            return this.tasks;

    }

    // add
    public void addTask(String task) {

       // ! Wrong -> Array
        // for(int i = 0; i < this.tasks.length; i++) {
        //     if(this.tasks[i] == null) {
        //         this.tasks[i] = task;
        //         break;
        //     };
        // }
        
        // *Correct-> List
        this.tasks.add(task);

    }
    // il demande au chef d'orcheestre (OS) pour allouer la memoire a une variable

    //if(this.tasks) this.tasks[-1] = task;
    
    // this.tasks 
    // pop, push,

    // remove
}

// JAVA
// array (not mutable) -> no add, no remove, 
// list (mutable) operations -> add, remove, update?
// tuple (not yet)

// Les tableaux heritent de la classe object, qui contient equals, toString -> pour faire un affichage sous forme de chaine de caracteres
// equals : permet de verifier les egalites entre des objets

// utilities like Arrays, Array
// allows to fill an array with a value
// Arrays.fill(tasks, "hello");
// requis : import java.util.Arrays;



