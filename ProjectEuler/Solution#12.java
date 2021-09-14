import java.io.*;
import java.util.*;

public class Solution {

    static int[] arr = new int[1002];
    static{
        int multiples = 0;
        int last = 0;
        int add = 1;
        for(int i = 1; i < 1002; i++){
            while(multiples < i){
                last += add;
                add++;
                multiples = getMultiples(last);
            }
            arr[i] = last;
        }
    }

    private static int getMultiples(int last) {
        if(last == 1)
            return 1;

        int multiples = 0;
        for(int i = 1; i < Math.ceil(Math.sqrt(last)); i++){
            if(last%i==0){
                multiples+=2;
            }
        }
        if(Math.ceil(Math.sqrt(last)) == Math.floor(Math.sqrt(last)))
            multiples++;

        return multiples;

    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i = 0; i < test; i++){
            int nums = sc.nextInt();
            System.out.println(arr[nums+1]);
        }
    }
}
