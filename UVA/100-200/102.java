import java.io.*;
import java.util.*;

public class 102 {
    
    public static void main(String[] args) {
        Scanner io = new Scanner(new BufferedInputStream(System.in));

        while(io.hasNext())
        {
            int[][] bins = new int[3][3];
            int[] sum = new int[3];
            int[][] minNums = new int[3][3];

            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++) {
                    bins[i][j] = io.nextInt();
                    sum[j] += bins[i][j];
                }
            }

            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++) {
                    minNums[i][j] = sum[j] - bins[i][j];
                }
            }

            int min1 = Integer.MAX_VALUE;
            String row = "";

            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++) {
                    for(int k = 0; k < 3; k++) {

                        if(i == j || j == k || k == i)
                            continue;
                        int val = minNums[0][i] + minNums[1][j] + minNums[2][k];
                        if(val < min1) {
                            min1 = val;
                            row = make(i, j, k);
                        }
                        else if(val == min1)
                        {
                            String temp = make(i, j, k);
                            if(temp.charAt(0) < row.charAt(0))
                                row = temp;
                            else if(temp.charAt(0) == row.charAt(0) && temp.charAt(1) < row.charAt(1))
                                row = temp;
                        }

                    }
                }
            }

            System.out.println(row + " " + min1);

        }
    }

    private static String make(int i, int j, int k) {
        String s = "";

        Map<Integer, Character> hello = null;
        if(i == 0)
            s += "B";
        else if(i == 1)
            s += "G";
        else if(i == 2)
            s += "C";

        if(j == 0)
            s += "B";
        else if(j == 1)
            s += "G";
        else if(j == 2)
            s += "C";

        if(k == 0)
            s += "B";
        else if(k == 1)
            s += "G";
        else if(k == 2)
            s += "C";

        return s;
    }
}

/*
1 2 3 4 5 6 7 8 9
5 10 5 20 10 5 10 20 10
 */
