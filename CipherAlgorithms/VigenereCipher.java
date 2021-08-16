// Encrypting and decrypting VigenereCipher with a key!!

import java.util.*;

public class VigenereCipher{

    private static Scanner io = new Scanner(System.in);
    private static String MappedKey;
    private static String message;

    VigenereCipher(String s) {
        String lower = s.toUpperCase();

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

    public static void main(String[] args) {

        int option;

        System.out.print("1.Encryption\n2.Decryptio\nChoose (1 or 2): ");
        option = io.nextInt();
        io.nextLine();

        if(option == 1){
            System.out.println("---ENCRYPTION---");
            MK();
            cipherMessage(message, MappedKey);
        }else if(option == 2){
            System.out.println("---DECRYPTION---");
            MK();
            cipherDecryption(message, MappedKey);
        }else{
            System.out.println("Wrong Option");
        }

    }

    private static void cipherDecryption(String message, String mappedKey) {

        String dec = "";
        for(int i = 0;i < message.length(); i++)
        {
            if(message.charAt(i) == ' ' && MappedKey.charAt(i) == ' ')
                dec+=" ";
            else
                dec += (char)(65 + itrCount((int)mappedKey.charAt(i), (int)message.charAt(i)));
        }
        System.out.println("Decrypted Text: " + dec);

    }

    private static int itrCount(int key, int message) {
        int[][] cipherTable = createVigenereTable();

        // We are checking how much the text has shifted from the axis of that particular character of the cipher
        // and the amount the text has shifted is the alphabet
        int temp = message - cipherTable[key-65][0];
        return temp < 0 ? temp+26 : temp;
    }

    private static void cipherMessage(String message, String mappedKey) {
        int[][] cipherTable = createVigenereTable();

        String ciphered = "";
        for(int i = 0; i < message.length(); i++)
        {
            if(message.charAt(i) == ' ' && MappedKey.charAt(i) == ' ')
                ciphered += " ";
            else
                ciphered += (char)cipherTable[(int)message.charAt(i)-65][(int)MappedKey.charAt(i)-65];
        }

        System.out.println("Encrypted Text: " + ciphered);
    }

    private static int[][] createVigenereTable() {
        int[][] table = new int[26][26];

        for(int i = 0; i < 26; i++){
            for(int j = 0; j < 26; j++){
                int tmp = 65+i+j;
                if(tmp > 90)
                    table[i][j] = tmp-26;
                else
                    table[i][j] = tmp;
            }//j
        }//i

        return table;
    }

    private static void MK()
    {
        System.out.println("Enter the message and the key\n***The MESSAGE and the KEY should be alphabetic***");

        // Input message
        System.out.print("Enter the message: ");
        message = io.nextLine();
        message = message.toUpperCase();

        // Input Key
        System.out.print("Enter the key: ");
        MappedKey = io.nextLine();
        MappedKey = MappedKey.toUpperCase();

        // Building the poly-alpha cipher
        String msg = "";

        for(int i = 0, j = 0; i < message.length(); i++)
        {
            // Ignoring the spaces
            if(message.charAt(i) == ' ')
                msg += " ";
            else
            {
                if(j < MappedKey.length()){
                    msg += MappedKey.charAt(j);
                    j++;
                }else{
                    j = 0;
                    msg += MappedKey.charAt(j);
                    j++;
                }
            }//if-else
        }//for

        MappedKey = msg;
    }
}
