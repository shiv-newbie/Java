// Merge Sort
// Worst Case: O(nlogn)

import java.io.BufferedInputStream;
import java.util.*;

public class MergeSort {

    public void sort(int[] arr, int l, int r){
        if(l < r){
            int m = (l+(r-1))/2;

            sort(arr, l, m);
            sort(arr, m+1, r);

            merge(arr, l, m , r);
        }
    }

    private void merge(int[] arr, int l, int m, int r) {

        int left = m-l+1;
        int right = r-m;

        int[] L = new int[left];
        int[] R = new int[right];

        for(int i = 0; i < left; i++)
            L[i] = arr[l+i];

        for(int i = 0; i < right; i++)
            R[i] = arr[m+1+i];

        int i = 0;int j = 0;
        while(i < left && j < right) {
            if (L[i] <= R[j]) {
                arr[l + i + j] = L[i];
                i++;
            } else {
                arr[l + i + j] = R[j];
                j++;
            }
        }

        while(i < left){
            arr[l + i + j] = L[i];
            i++;
        }
        while(j < right){
            arr[l + i + j] = R[j];
            j++;
        }

    }

    public static void main(String[] args) {

        int[] arr = new int[]{2, 8, 5, 3, 9, 4, 1};
        MergeSort obj = new MergeSort();

        int len = arr.length;
        obj.sort(arr, 0, len-1);

        for(int i = 0; i < len; i++)
            System.out.print(arr[i] + " " );
    }
}
