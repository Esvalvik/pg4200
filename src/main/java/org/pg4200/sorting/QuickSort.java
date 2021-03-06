package org.pg4200.sorting;

/**
 * Created by arcuri82 on 21-Aug-17.
 */
public class QuickSort implements MySort{


    @Override
    public <T extends Comparable<T>> void sort(T[] array) {
        if(array == null){
            return;
        }

        quicksort(0, array.length-1, array);
    }

    private <T extends Comparable<T>> void quicksort(int low, int high, T[] array) {

        int i = low;
        int j = high;

        T pivot = array[low + (high-low)/2];

        while (i <= j) {

            while (array[i].compareTo(pivot) < 0) {
                i++;
            }

            while (array[j].compareTo(pivot) > 0) {
                j--;
            }

            if (i <= j) {
                T tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }

        if (low < j) {
            quicksort(low, j, array);
        }

        if (i < high) {
            quicksort(i, high, array);
        }
    }
}
