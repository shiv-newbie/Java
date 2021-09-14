import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] grid = new int[20][20];
        for(int grid_i=0; grid_i < 20; grid_i++){
            for(int grid_j=0; grid_j < 20; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }

        int product = 1;
        int max = 0;
        // Horizontal
        for(int i=0; i < 20; i++) {
            for(int j = 0; j < 17; j++){
                if(j == 0){
                    product = grid[i][j]*grid[i][j+1]*grid[i][j+2]*grid[i][j+3];
                }else {
                    if (grid[i][j - 1] == 0) {
                        product = grid[i][j] * grid[i][j + 1] * grid[i][j + 2] * grid[i][j + 3];
                    } else {
                        product /= grid[i][j - 1];
                        product *= grid[i][j + 3];
                    }
                }
                if(product > max){
                    max = product;
                }
            }
        }

        // Vertical
        for(int j = 0; j < 20; j++) {
            for(int i = 0; i < 17; i++){
                if(i == 0){
                    product = grid[j][i]*grid[j][i+1]*grid[j][i+2]*grid[j][i+3];
                }else {
                    if (grid[j][i - 1] == 0) {
                        product = grid[j][i]*grid[j][i+1]*grid[j][i+2]*grid[j][i+3];
                    } else {
                        product /= grid[j][i - 1];
                        product *= grid[j][i + 3];
                    }
                }
                if(product > max){
                    max = product;
                }
            }
        }

        // Right-diagonal
        for(int i=0; i < 17; i++) {
            for(int j = 0; j < 17; j++) {
                product = grid[i][j] * grid[i+1][j+1] * grid[i+2][j+2] * grid[i+3][j+3];
                if(product > max){
                    max = product;
                }
            }
        }

        // Left-diagonal
        for(int i=0; i < 17; i++) {
            for(int j = 3; j < 20; j++) {
                product = grid[i][j] * grid[i+1][j-1] * grid[i+2][j-2] * grid[i+3][j-3];
                if(product > max){
                    max = product;
                }
            }
        }
        System.out.println(max);
    }
}
