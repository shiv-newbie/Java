import java.io.*;
import java.math.BigInteger;
import java.util.*;

import static java.time.Year.isLeap;

public class Solution {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        String[] all = new String[test];
        for(int i = 0; i < test; i++) {
            all[i] = sc.next();
            all[i] = all[i].toUpperCase();
        }
        Arrays.sort(all);

        test = sc.nextInt();
        for(int i = 0; i < test; i++){
            String a = sc.next();
            a = a.toUpperCase();
            int num = 0;

            while(!all[num].equals(a)){
                num++;
            }
            int tot = 0;
            for(int j = 0; j < a.length(); j++){
                tot += a.charAt(j) - 'A';
                tot+=1;
            }

            tot *= num+1;
            System.out.println(tot);
        }


    }
}
