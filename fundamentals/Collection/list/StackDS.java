package Collection.list;

import java.util.ListIterator;
import java.util.Stack;

// STACK
// lifo : last in - first out
// thread-safe
// accepte null
// pas pour faire de la lecture
// class specialisé de vector, pourtant en multi-thread
public class StackDS {
    public static void main(String[] args) {

        Stack<Cat> group = new Stack<Cat>();

        Cat c1 = new Cat("Pepe");
        Cat c2 = new Cat("Mencho");
        Cat c3 = new Cat("dina");
        Cat c4 = new Cat("Kito");

        group.push(c1);
        group.push(c2);
        group.push(c3);
        group.push(c4);

        // creation d'ITERATOR
        ListIterator<Cat> lit = group.listIterator();

        while (lit.hasNext())
            lit.next().meow();

        group.peek().meow();

    }
    // push -> pour rajouter a la pile
    // pop -> pour enlever de la pile
    // peek -> au sommet de la pile

}
