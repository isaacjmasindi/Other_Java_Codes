import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args){

        int[] array = { 14, 9, 28, 3, 7, 63, 89, 5};

        sort(array);

        System.out.print(Arrays.toString(array));
    }

    public static void sort(

            int[] Array) {
        //This calls the quicksort method  to sort the given array list
        quickSort(Array, 0, Array.length-1);
    }

    private static int median(int Array[], int first, int last){

        //the center will hold the position of the median of the three (left, right and middle)
        int middle = (first + last) / 2;

        // The if statements will postition all the values in order
        if (Array[first] > Array[middle]){

            swap(Array, first, middle);}

        if (Array[first] > Array[last]){

            swap(Array, first, last);}

        if (Array[middle] > Array[last]){

            swap(Array, middle, last);}

        return middle;
    }



    public static void swap(int[] Array, int i, int j) {

        //swaps the i and  j value

        int temp = Array[i];

        Array[i] = Array[j];

        Array[j] = temp;
    }

    private static void quickSort(int Array[], int first, int last){

        int i = first;

        int j = last - 1;

        int pivot;

        if (first < last){

            int middle = median(Array, first, last);

            //if there are less than or equal to 3 values, there are just ordered
            if ((last - first) >= 3){

                //the pivot is set as the median
                pivot = Array[middle];

                swap(Array, middle, last);

                do {
                    while (Array[i] <= pivot && i < last) i++;

                    while (Array[j] >= pivot && j > first) j--;

                    //the values are swapped
                    if (i < j) swap(Array, i, j);

                } while (i < j);

                //it set the position of the pivot
                swap(Array, i, last);

                quickSort(Array, first, i-1);

                quickSort(Array, i+1, last);
            }
        }
    }
}

