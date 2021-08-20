// Selection Sort
// Worst Case: O(n^2)

import java.util.*;

public class SelectionSort {

    public void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int index = i;

            for(int j = i; j < arr.length; j++)
                if(arr[j] < arr[index])
                    index = j;

            int x = arr[i];
            arr[i] = arr[index];
            arr[index] = x;

        }
    }

    public static void main(String[] args) {

        int[] arr = new int[]{2, 8, 5, 3, 9, 4, 1};
        SelectionSort obj = new SelectionSort();

        int len = arr.length;
        obj.sort(arr);

        for(int i = 0; i < len; i++)
            System.out.print(arr[i] + " " );
    }
}

