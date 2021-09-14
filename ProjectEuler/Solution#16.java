import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {

    static String[] all = new String[10002];
    static long[] nums = new long[10002];
    static {
        all[0] = "1";
        nums[0] = 1;
        String x = "";
        BigInteger f = new BigInteger("1");
            for(int i = 1; i <= 10000; i++){
                f = f.multiply(BigInteger.valueOf(2));
                all[i] = ""+f;
            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            int tmp = sc.nextInt();
            if(nums[tmp] == 0){
                long sum = 0;
                for(int i = 0; i < all[tmp].length(); i++){
                    sum += (long)(all[tmp].charAt(i) - '0');
                }
                nums[tmp] = sum;
            }
            
            System.out.println(nums[tmp]);
        }
    }
}
