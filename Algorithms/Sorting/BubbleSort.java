// Bubble Sort

import java.io.BufferedInputStream;
import java.util.*;

public class BubbleSort {

    public static int[] BubbleSort(int[] arr){
        for(int i = arr.length-1; i >=1; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    int x = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = x;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{2, 8, 5, 3, 9, 4, 1};
        BubbleSort(arr);

        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " " );
    }
}
