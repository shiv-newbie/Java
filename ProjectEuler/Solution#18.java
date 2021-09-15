import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for(int i = 0; i < test; i++){
            int rows = sc.nextInt();
            int[][] grid = new int[rows][rows];
            // Input
            for(int j = 0; j < rows; j++) {
                for (int k = 0; k <= j; k++){
                    grid[j][k] = sc.nextInt();
                }
            }

            for(int j = rows-1; j>=1; j--) {
                for (int k=rows-1; k>=1; k--){
                    grid[j-1][k-1] += Math.max(grid[j][k], grid[j][k-1]);
                }
            }
            System.out.println(grid[0][0]);
        }
    }
}
