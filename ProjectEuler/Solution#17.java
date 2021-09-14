import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {

    static String[] ones = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    static String[] tenOnes = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    static String[] tens = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            long tmp = sc.nextLong();
            if(tmp == 0){
                System.out.println("Zero");
                continue;
            }
            long hundreds = tmp % 1000;
            tmp/=1000;
            long thousands = tmp % 1000;
            tmp /= 1000;
            long millions = tmp % 1000;
            tmp /= 1000;
            long billions = tmp % 1000;
            tmp /= 1000;
            long trillion = tmp;

            if(trillion == 1){
                System.out.println("One Trillion");
                continue;
            }
            String eng = "";
            long h, t, o;
            if(billions != 0){
                h = billions/100;
                if(h != 0){
                    eng += ones[(int)h-1] + " Hundred ";
                }
                long temp = billions%100;
                if(temp == 0){
                    temp = 0;
                }else if(temp > 10 && temp < 20){
                    eng += tenOnes[(int)temp-11] + " ";
                }else if(temp < 10 && temp > 0){
                    eng += ones[(int)temp-1] + " ";
                }else if(temp % 10 == 0){
                    eng += tens[(int)(temp/10)-1] + " ";
                }else{
                    eng += tens[(int)(temp/10)-1] + " " + ones[(int)(temp%10)-1] + " ";
                }
                eng += "Billion ";
            }
            if(millions != 0){
                h = millions/100;
                if(h != 0){
                    eng += ones[(int)h-1] + " Hundred ";
                }
                long temp = millions%100;
                if(temp == 0){
                    temp = 0;
                }else if(temp > 10 && temp < 20){
                    eng += tenOnes[(int)temp-11] + " ";
                }else if(temp < 10 && temp > 0){
                    eng += ones[(int)temp-1] + " ";
                }else if(temp % 10 == 0){
                    eng += tens[(int)(temp/10)-1] + " ";
                }else{
                    eng += tens[(int)(temp/10)-1] + " " + ones[(int)(temp%10)-1] + " ";
                }
                eng += "Million ";
            }

            if(thousands != 0){
                h = thousands/100;
                if(h != 0){
                    eng += ones[(int)h-1] + " Hundred ";
                }
                long temp = thousands%100;
                if(temp == 0){
                    temp = 0;
                }else if(temp > 10 && temp < 20){
                    eng += tenOnes[(int)temp-11] + " ";
                }else if(temp < 10 && temp > 0){
                    eng += ones[(int)temp-1] + " ";
                }else if(temp % 10 == 0){
                    eng += tens[(int)(temp/10)-1] + " ";
                }else{
                    eng += tens[(int)(temp/10)-1] + " " + ones[(int)(temp%10)-1] + " ";
                }
                eng += "Thousand ";
            }

            if(hundreds != 0){
                h = hundreds/100;
                if(h != 0){
                    eng += ones[(int)h-1] + " Hundred ";
                }
                long temp = hundreds%100;
                if(temp == 0){
                    temp = 0;
                }else if(temp > 10 && temp < 20){
                    eng += tenOnes[(int)temp-11] + " ";
                }else if(temp < 10 && temp > 0){
                    eng += ones[(int)temp-1] + " ";
                }else if(temp % 10 == 0){
                    eng += tens[(int)(temp/10)-1] + " ";
                }else{
                    eng += tens[(int)(temp/10)-1] + " " + ones[(int)(temp%10)-1];
                }
            }

            System.out.println(eng);
        }
    }

}
