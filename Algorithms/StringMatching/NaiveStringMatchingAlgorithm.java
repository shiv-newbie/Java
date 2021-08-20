// Naive String Matching Algorithm

 import java.io.*;
 import java.util.*;

 public class Learning {

     public static int strStr(String haystack, String needle) {
         if(needle == "" || needle == haystack)
             return 0;

         int isTrue = -1;
         for(int i = 0; i < haystack.length()-needle.length()+1; i++){
             int count = 0;
             for(int j = 0; j < needle.length(); j++) {
                 if(haystack.charAt(i+count) != needle.charAt(j))
                     break;
                 count++;
             }
             if(count == needle.length())
             {
                 isTrue = i;
                 break;
             }
         }

         return isTrue;
     }

     public static void main(String[] args) {
         int x = strStr("abcde","cde");
         System.out.println(x);
     }
 }
