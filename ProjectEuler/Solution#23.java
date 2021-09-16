import java.io.*;
import java.math.BigInteger;
import java.util.*;

import static java.time.Year.isLeap;

public class Solution {

    static ArrayList<Integer> all = new ArrayList<Integer>();
    static HashMap<Integer, Boolean> isThere = new HashMap<>();
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for(int i = 2; i <= 28123; i++){
            if(isAbundantNumber(i)){
                all.add(i);
            }
        }
        int k;
//        System.out.println(isThere.get(48));
        for(int i = 0; i < all.size(); i++){
            for(int j = 0; j < all.size(); j++){
                int num = all.get(i)+all.get(j);
                if(num <= 28123){
                    isThere.put(num, true);
//                    if(num == 49)
//                        k = 1;
                }
            }
        }
        int test = sc.nextInt();
        for(int i = 0; i < test; i++){
            int x = sc.nextInt();
            if(x > 28123 || isThere.get(x) != null){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

    private static boolean isAbundantNumber(int num) {
        if(num == 28)
            num = 28;
        int tot = 1;
        for(int i = 2; i < Math.ceil(Math.sqrt(num)); i++){
            if(num % i == 0){
                tot+=i;
                tot+=num/i;
            }
        }
        if(tot > num) return true; return false;
    }
}
