import java.util.*;
import java.io.*;

public class Main{
    public static class ShiftCipher{
        ShiftCipher(String s) {
            String lower = s.toLowerCase();

            StringBuilder str = new StringBuilder(s);
            for(int j = 0; j <= 25; j++)
            {
                for(int i = 0; i < s.length(); i++)
                {
                    if(lower.charAt(i) < 'a' || lower.charAt(i) > 'z')
                        continue;
                    int temp = lower.charAt(i)-'a'- j;
                    if(temp <= -1)
                        temp += 26;
                    str.setCharAt(i, (char)(temp+97));
                }
                System.out.println("ROT-" + j + " " + str);
            }

        }
    }

    public static void main(String[] args) {
        ShiftCipher c = new ShiftCipher("ovdthufwvzzpislrlfzhylaolyl");
    }
}
