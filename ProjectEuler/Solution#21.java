import java.io.*;
import java.math.BigInteger;
import java.util.*;

import static java.time.Year.isLeap;

public class Solution {

    static int[] all = new int[100001];
    static int[] truth = new int[100001];

    static int calcOther(int x){
        int tot = 1;
        int sqrt = (int)Math.ceil(Math.sqrt(x));
        int j;
        int add;
        if(x%2==0){
            add = 1;
            j = 2;
        }
        else{
            add = 2;
            j = 3;
        }
        for(; j < sqrt; j+=add){
            if(x % j == 0){
                tot+=j;
                tot+=x/j;
            }
        }
        return tot;
    }

    static {
        for(int x = 6; x < 100001; x++) {
            if(all[x] == 0) {
                all[x] = calcOther(x);
            }
            if(all[x] <= 100000 && all[all[x]]==0) {
                all[all[x]] = calcOther(all[x]);
            }
            if(all[x] > 100000 || all[all[x]] > 100000)
                continue;

            if(all[all[x]] == x && x!=all[x]) {
                truth[x] = 1;
                truth[all[x]] = 1;
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i = 0; i < test; i++) {
            int x = sc.nextInt();
            int tot = 0;
            for(int j = 6; j < x; j++){
                if(truth[j] == 1 ){
                    tot += j;
                }
            }
            System.out.println(tot);
        }



    }
}
