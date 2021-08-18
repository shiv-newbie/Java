// 3n+1 Problem

import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class 100 {

    public static int calculate(int num){


        int calc = 0;

        while(num != 1)
        {
            if(num % 2 == 0)
            {
                num /= 2;
                calc++;
            }
            else
            {
                num = 3*num+1;
                calc++;
            }
        }

        return calc;
    }


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        FileWriter my = new FileWriter("myFile.txt");


        while(sc.hasNext())
        {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int max = -1;

            int st = min(start, end);
            int ed = max(start, end);

            for(int i = st; i <= ed; i++)
            {
                int c = calculate(i);
                if(c > max)
                    max = c;
            }

            System.out.printf("%d %d %d\n", start, end, max+1);
        }
    }
}

