package Sorting;

public class SelectionSort {


    public static int[] exch(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    public static boolean isSorted(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i+1]) return false;
        } 
        return true;
    }
    
    public static int[] selectionSort(int[] arr, int n) {

        for (int i = 0; i < n; i++){
            int min = i;
            for(int j = 1; j < n; j++)
                if(arr[j] < arr[min]) min = j;
            exch(arr, i, min);
        }

        return arr;
    }
}
