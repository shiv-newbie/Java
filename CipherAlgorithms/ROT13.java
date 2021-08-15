import java.util.*;
import java.io.*;

public class Main{
    public static class ROT13{
        ROT13(String s) {
            String lower = s.toLowerCase();

            StringBuilder str = new StringBuilder(s);
            for(int i = 0; i < s.length(); i++)
            {
                if(lower.charAt(i) == ' ')
                    continue;
                int temp = lower.charAt(i)-'a'- 13;
                if(temp <= -1 && temp >= -13)
                    temp += 26;
                str.setCharAt(i, (char)(temp+97));
            }
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        ROT13 c = new ROT13("abcdefghijklm");
    }
}
