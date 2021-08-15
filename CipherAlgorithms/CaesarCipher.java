import java.util.*;
import java.io.*;

public class Main{
    public static class CaesarCipher{
        CaesarCipher(String s) {
            String lower = s.toLowerCase();

            StringBuilder str = new StringBuilder(s);
            for(int i = 0; i < s.length(); i++)
            {
                int temp = lower.charAt(i)-'a'- 3;
                if(temp <= -1 && temp >= -3)
                    temp += 26;
                str.setCharAt(i, (char)(temp+97));
            }
            System.out.println(str);
        }
    }


    public static void main(String[] args) {
        CaesarCipher c = new CaesarCipher("EHJLQWKHDWWDFNQRZABC");
    }
}
