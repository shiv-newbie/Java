import java.io.*;
import java.math.BigInteger;
import java.util.*;

import static java.time.Year.isLeap;

public class Solution {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for (int j = 0; j < test; j++) {
            long num = 1;
            StringBuilder tmp = new StringBuilder("abcdefghijklm");
            for (int i = 1; i < tmp.toString().length(); i++) {
                num *= (long) i;
            }
            long x = sc.nextLong();
            x--;
            String a = "";
            for(int i = tmp.toString().length(); i >=1 ; i--){
                long y = num / i;
                int get = (int) (x/num);

                a+=tmp.toString().charAt(get);
                tmp.deleteCharAt(get);
                x %= (num);

                if(i > 1)
                    num /= (i-1);
            }
            System.out.println(a);
        }
    }
}
