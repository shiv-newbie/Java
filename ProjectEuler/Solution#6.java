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
            int n = in.nextInt();
            long sumOfSquares = (long)n*(n+1)*(2*n+1)/6;
            long tmp = (long)n*(n+1)/2;
            long squareOfSum = tmp*tmp;
            tmp = sumOfSquares - squareOfSum;
            if(tmp < 0)
                tmp *= -1;
            System.out.println(tmp);
        }
    }
}
