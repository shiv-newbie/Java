import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static boolean isPallindrome(int num){
        String s = Integer.toString(num);
        int len = s.length();
        for(int i = 0; i < len/2; i++){
            if(s.charAt(i) != s.charAt(len-1-i))
                return false;
        }
        return true;
    }

    public static ArrayList<Integer> nums = new ArrayList<>();

    static {
        for(int i = 101; i < 1000; i++){
            for(int j = 101; j < 1000; j++){
                if(isPallindrome(i*j)){
                    nums.add(i*j);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int idx = 0;
            for(int i = 0; i < nums.size(); i++){
                int tmp = nums.get(i);
                if(tmp > nums.get(idx) && tmp < n){
                    idx = i;
                }
            }
            System.out.println(nums.get(idx));
        }
    }
}
