import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        String[] all = new String[test];
        sc.nextLine();
        for(int i = 0; i < test; i++){
            all[i] = sc.nextLine();
        }

        String num = "";
        int carry = 0;
        for(int i = 0; i < 50; i++){
            int tmp = carry;
            for(int j = 0; j < test; j++){
                tmp += all[j].charAt(49-i) - '0';
            }
            num = Integer.toString(tmp%10) + num;
            carry = tmp/10;
        }
        num = Integer.toString(carry) + num;
        System.out.println(num.substring(0, 10));
    }
}
