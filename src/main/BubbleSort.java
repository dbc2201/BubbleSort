package main;

public class BubbleSort {

    private long[] array;   //  this array will hold the data items for sorting

    private int numElements;    //  this is the number of elements the array has

    public BubbleSort(int n) {
        array = new long[n];    //  create the array with 'n' items
        numElements = 0;    //  there are no items in the array yet
    }

    /*
     * method to add values to the array
     * */
    public void insert(long value) {
        array[numElements] = value;
        numElements++;
        /*
         * this way, we can store the current number of elements in the array
         * */
    }

    /*
     * method to display the content of the array
     * */
    public void display() {
        for (int i = 0; i < numElements; i++) {
            System.out.println(array[i] + " ");
            /*
             * to print all the items of the array in a comma separated manner.
             * */
        }
        System.out.println(); //  to print a newline at the end of the array
    }


}
