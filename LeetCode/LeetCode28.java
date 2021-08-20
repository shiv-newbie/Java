// Knuth-Morris-Puth Algorithm for String Matching

import java.io.BufferedInputStream;
import java.util.*;

public class LeetCode28 {

    private static int[] LPS(String needle)
    {
        int len = needle.length();
        int[] table = new int[len];
        int j = 0;
        int i = 1;

        while(i < len)
        {
            if (needle.charAt(j) == needle.charAt(i)) {
                j++;
                table[i] = j;
                i++;
            }
            else {
                if(j != 0) {
                    j = table[j - 1];
                }
                else {
                    table[i] = j;
                    i++;
                }
            }
        }
        return table;
    }

    private static int KMP(String par, String child)
    {
        int[] table = LPS(child);

        int j = 0;

        for(int i = 0; i < par.length(); i++)
        {
            while(j > 0 && par.charAt(i) != child.charAt(j)) {
                j = table[j - 1];
            }

            if(par.charAt(i) == child.charAt(j))
                j++;

            if(j == child.length())
            {
                return (i-j+1);

            }
        }

        return -1;
    }


    public static void main(String[] args) {
        int x = KMP("aabaaabaaac","aabaaac");
        System.out.println(x);
    }
}

// Worst Case time: O(m+n)
