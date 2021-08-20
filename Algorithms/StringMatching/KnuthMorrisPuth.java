// Knuth-Morris-Puth Algorithm for String Matching

import java.io.BufferedInputStream;
import java.util.*;

public class KnuthMorrisPuth {

    private static int[] LPS(String needle)
    {
        int len = needle.length();
        int[] table = new int[len];

        for(int i = 1; i < len-1; i++) {
            int j = table[i - 1];

            while (j > 0 && needle.charAt(j) != needle.charAt(i))
                j = table[j - 1];

            if (needle.charAt(j) == needle.charAt(i)) {
                table[i] = table[i - 1] + 1;
                j++;
            }
        }
        return table;
    }

    private static ArrayList<Integer> KMP(String par, String child)
    {
        int[] table = LPS(child);
        ArrayList<Integer> matches = new ArrayList<>();

        int j = 0;

        for(int i = 0; i < par.length(); i++)
        {
            while(j > 0 && par.charAt(i) != child.charAt(j))
                j = table[j-1];

            if(par.charAt(i) == child.charAt(j))
                j++;

            if(j == child.length())
            {
                matches.add(i-j+1);
                i = i-j+2;
                j = 0;
            }
        }

        return matches;
    }


    public static void main(String[] args) {
        ArrayList<Integer> x = KMP("aaababaaab", "aaab");
    }
}

// Worst Case time: O(m+n)
