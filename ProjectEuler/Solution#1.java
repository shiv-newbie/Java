import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution#1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            long count = 0;
            long x = 0;
            if(n%3==0){
                x = n/3 - 1;
            }else{
                x = n/3;
            }
            x = x*(x+1)/2;
            count += x*3;
            if(n%5==0){
                x = n/5 - 1;
            }else{
                x = n/5;
            }
            x = x*(x+1)/2;
            count += x*5;
            if(n%15==0){
                x = n/15 - 1;
            }else{
                x = n/15;
            }
            x = x*(x+1)/2;
            count -= x*15;
            System.out.println(count);
        }
    }
}
