import java.io.*;
import java.util.*;

public class Solution {

    public static long[] nums = new long[5000002];
    public static long[] arr = new long[5000002];
    private static long calculate(int num){

        if(nums[num] != 0){
            return nums[num];
        }
        if(num%2 == 0){
            long tmp =  1+calculate(num/2);
            nums[num] = tmp;
            return nums[num];
        }
        long count = 1;
        long tmp = (long) 3*num+1;
        while(tmp > 5000001){
            if(tmp%2==0){
                tmp/=2;
            }else{
                tmp = tmp*3+1;
            }
            count++;
        }
        nums[num] = count + calculate((int)tmp);
        return nums[num];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int count = 1;
        // all the powers of 2 => {2, 4, 8, 16, ...}
        for(int i = 2; i <= 5000001; i*=2){
            nums[i] = count++;
        }
        
        // all the odd numbers
        for(int i = 3; i <= 5000001; i+=2){
            calculate(i);
        }

        // figuring out the number which has the max steps till
        // the given number
        
        for(int i = 2; i <= 5000001; i++){
            if(nums[i] >= nums[(int)arr[i-1]]){
                arr[i] = i;
            }else{
                arr[i] = arr[i-1];
            }
        }
        for (int i = 0; i < test; i++){
            int num = sc.nextInt();
            System.out.println(arr[num]);
        }

    }
}
