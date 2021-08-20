// Building correct Bracket Sequences

import java.io.BufferedInputStream;
import java.util.*;

public class LeetCode22 {

    public static List<String> generateParenthesis(int n) {
        List<String> all = new ArrayList<String>();
        generate(n, 0, 0, new StringBuilder(), all);
        return all;
    }

    private static void generate(int n, int s, int e, StringBuilder str, List<String> all) {
        if(e == n) {
            all.add(str.toString());
        }

        if(s < n){
            str.append("(");
            generate(n, s+1, e, str, all);
            str.deleteCharAt(str.length()-1);
        }
        if(s > e)
        {
            str.append(")");
            generate(n, s, e+1, str, all);
            str.deleteCharAt(str.length()-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        List<String> n = generateParenthesis(3);
        System.out.println(n);
    }
}

