package Datatypes.Array;
/*  Basic way declaration, only to specify the space to hold in array :

 int tab[] = new int[3];

## Subtilities of placing brackets : int tab[] / int[] tab

  int[] tab, tab2; // here both are arrays

  int tab[], tab2; // here only tab is array

## declare initializting array

    - EXPLICIT
    int tab[] = new int[]{1,2,3};


    - COMMON WAY
    int tab[] = {1,2,3};


 */

public class ArrayDS {

    public static void main(String[] args) {
        // 1.
        int[] tab = { 12, 2, 3 };

        System.out.println(tab);
        // it returns the address

        System.out.println(tab[0]);

        // as is stocked in contiguous space (one after the other). we can find the way
        // to display whole array
        System.out.println(tab[0]);
        System.out.println(tab[1]);
        System.out.println(tab[2]);

        // if we try to access to another item out of array -> java exception error

        // parcour an array. indice dynamique (as contray of index statique [ex.above])
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

        // other way
        // for each iteration of loop, we named el.
        // we retrieve each index of loop
        for (int el : tab) {
            System.out.println(el);
        }

        // 2. tableau a 2 dimensions(matrice)
        int[][] tab2 = { { 1, 2, 3 }, { 4, 5, 6 } };

        /* MATRIX
         * {      
         *    {1, 2, 3},
         *    {4, 5, 6}
         * }
         */
        // chaque element est un tableau

        // For initializing without declaring it.
        // int[][] tab = new int[2][3];

        // ? TO FIND BY INDEX
        System.out.println(tab2[1][1]);
        // this prints 5


        // parcourir

        for(int i = 0; i < tab2.length; ++i)
            for(int j = 0; j < tab2[i].length; ++j) 
                System.out.println(tab2[i][j]);
        
        

       // for(int[] i : tab2)
         //   for(int number : i)
           //     System.out.println(number);

    }

    // add method printab
    public static void printTab(int[] t) {
        for(int element: t) {
            System.out.println(t);
        }
    }
}
// we find also another ds, called collection, where we can store different data

// TIP :
// from right to left we can read the type of data. ex.
// int[][] tab2 = tab2 is an array of array of type int.


// comment on le lis, modifie, delete
// method :
// printTab(tab)
