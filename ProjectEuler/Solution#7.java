import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static boolean isPrime(int num){
        if(num <= 3)
            return true;
        int x = (int) Math.sqrt(num)+1;
        for(int i = 3; i <= x; i+=2){
            if(num % i == 0)
                return false;
        }
        return true;
    }

    static int[] primes = new int[10000];
    
    static {
        int i = 0;
        primes[i++]=2;
        int num = 3;
        while(i<=9999){
            if(isPrime(num)){
                primes[i++]=num;
            }
            num+=2;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(primes[n-1]);
        }
    }
}
