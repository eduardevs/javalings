package projects.Algorithms.Sort;

public class BubbleSort {

    static void of(int[] arr) {
        for(int i = 0; i < arr.length;++i) {
            for(int j = 0; j < arr.length - 1 - i; ++j) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp; 
                }

            }
        }
    }   

    static void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] tab = {1,5,3,2,7,4};
        of(tab);
        printArray(tab, tab.length);
    }


   
}
