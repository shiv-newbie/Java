import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        for(int a0 = 0; a0 < k; a0++){
            int n = in.nextInt();
           
            // we calculate c = N - a - b
            // Now, we know, a^2 + b^2 = c^2 and c = N - a - b
            // in the above equations, we know N, c and a so we treat them as constant
            // Equate a^2 + b^2 = c^2 and c = N - a - b and Find out b
            // b = (N^2 - 2*N*a)/(2*(N-a))
            
           
            int max = -1;
            boolean isTrue = false;
             for(int a = 1; a < n/3+1; a++){
                int b = (n*n-2*n*a)/(2*(n-a));
                int c = n-a-b;
                if(a*a + b*b == c*c){
                    int prod = a*b*c;
                    if(prod > max){
                        max = prod;
                    }
                }
            }

            System.out.println(max);
            
        }
    }
}
