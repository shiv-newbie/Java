import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long n1 = 5;
            long n2 = 8;
            long count = 2;
            while(n2 < n){
                if ((n2 & 1) == 0)
                    count += n2;
                
                n2 += n1;
                n1 = n2 - n1;
            }
            System.out.println(count);
        }
    }
}
