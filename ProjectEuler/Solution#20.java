import java.io.*;
import java.math.BigInteger;
import java.util.*;

import static java.time.Year.isLeap;

public class Solution {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for(int i = 0; i < test; i++){
            int x = sc.nextInt();
            if(x == 0){
                System.out.println(1);
                continue;
            }
                
            BigInteger str = new BigInteger(""+x);
            while(x-->1){
                str = str.multiply(BigInteger.valueOf(x));
            }
            String calc = "" + str;
            int tot = 0;
            for(int y = 0; y < calc.length(); y++){
                tot += calc.charAt(y) - '0';
            }

            System.out.println(tot);
        }
    }
}
