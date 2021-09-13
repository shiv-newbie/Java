import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static boolean smallestMultiple(int num){   // Till 40
        String s = Integer.toString(num);
        int len = s.length();
        for(int i = 0; i < len/2; i++){
            if(s.charAt(i) != s.charAt(len-1-i))
                return false;
        }
        return true;
    }

    public static ArrayList<Long> nums = new ArrayList<>();
    public static ArrayList<Long> ans = new ArrayList<>();
    static {
        for(long i = 1; i <=40; i++){
            nums.add(i);
        }
        ans.add((long)1);
        for(int i = 1; i < 40; i++){
            long temp = nums.get(i);
            long y = ans.get(i-1)*temp;
            if(y == 12)
                y = 12;
            ans.add(y);
            for(int j = i; j < 40; j+=(i+1)){
                long x = nums.get(j);
                if(x != 1){
                    nums.set(j, x/temp);
                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(ans.get(n-1));
        }
    }
}
