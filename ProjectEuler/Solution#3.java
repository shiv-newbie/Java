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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long num = in.nextLong();
            long x = (long) (Math.sqrt(num)+1);
            long biggest = 0;
            for(long i = 1; i <= x; i++){
                if(num % i == 0) {
                    if (i > biggest && isPrime(i)) {
                        biggest = i;
                    } 
                    if (num / i > biggest && isPrime(num / i)) {
                        biggest = num / i;
                    }
                }
            }
            System.out.println(biggest);
        }
    }
}
