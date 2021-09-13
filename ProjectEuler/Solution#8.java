import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    // Rolling Product
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = scan.nextInt();
            int k = scan.nextInt();
            String num = scan.next();
            int product=1;
            int max=0;
            int i,j;
            for(i = 0; i < k; i++){
                product *= num.charAt(i) - '0';
            }
            
            max = product;
            
            for(i=1; i<n-k+1; i++) {
                if(num.charAt(i-1) == '0'){
                    product = 1;
                    for(j = 0; j < k-1; j++){
                        product *= num.charAt(i+j) - '0';
                    }
                }else{
                    int x = num.charAt(i-1) - '0';
                    product /= x;
                }
                char ch = num.charAt(i+k-1);
                int m = Integer.parseInt(String.valueOf(ch));
                product=product*m;

                if(product>max)
                    max=product;
            }
            System.out.println(max);
        }
        scan.close();
    }

}
