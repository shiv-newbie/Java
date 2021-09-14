import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static boolean isPrime(long num){
        if(num <= 3)
            return true;
        if(num % 2 ==0)
            return false;
        long x = (long) Math.sqrt(num)+1;
        for(long i = 3; i <= x; i+=2){
            if(num % i == 0)
                return false;
        }
        return true;
    }

    public static ArrayList<Long> primes = new ArrayList<>();
    static{
        long num = 2;
        while(num != 1000000){
            if(isPrime(num)){
                primes.add(num);
            }
            num++;
        }
    }

    public static long calculateSum(long num){
        int i = 0;
        long ans = 0;
        while(primes.get(i) <= num){
            ans += primes.get(i);
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextInt();
        for(long a0 = 0; a0 < t; a0++){
            long n = in.nextInt();
            System.out.println(calculateSum(n));
        }
    }
}
