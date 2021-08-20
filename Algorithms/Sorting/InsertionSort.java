// Selection Sort
// Worst Case: O(n^2)

import java.util.*;

public class InsertionSort {

    public void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int index = i;
            int x = arr[i];
            while(index != 0 && x < arr[index-1])
            {
                arr[index] = arr[index-1];
                index--;
            }
            arr[index] = x;
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[]{2, 8, 5, 3, 9, 4, 1};
        InsertionSort obj = new InsertionSort();

        int len = arr.length;
        obj.sort(arr);

        for(int i = 0; i < len; i++)
            System.out.print(arr[i] + " " );
    }
}

