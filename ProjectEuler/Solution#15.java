import java.io.*;
import java.util.*;

public class Solution {

    static int[][] matrix = new int[505][505];
    static {
        for(int i = 1; i <= 500; i++){
            matrix[1][i] = i+1;
            matrix[i][1] = i+1;
        }
    
        int MOD = (int)(Math.pow(10,9) + (double)7); // This is really important
        for(int i = 2; i <= 500; i++){
            for(int j = 2; j <= 500; j++){
                matrix[i][j] = (matrix[i-1][j]+matrix[i][j-1])%MOD;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int w, h;
        while(test-- != 0){
            w = sc.nextInt();
            h = sc.nextInt();
            System.out.println(matrix[w][h]);
        }
    }
}
