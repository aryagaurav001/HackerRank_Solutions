import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        // Write your code here.
        int count = 0;
        List<String> tokens = new ArrayList<>();
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isAlphabet(ch) || isDigit(ch)) {
                temp += ch;
                if (i == str.length() - 1 && !temp.equals("")) {
                    count++;
                    tokens.add(temp);
                }
            } else {
                if(temp.equals(""))continue;
                count++;
                tokens.add(temp);
                temp = "";
            }
        }

        System.out.println(count);
        for (String token : tokens) {
            System.out.println(token);
        }
        scan.close();
    }

    private static boolean isAlphabet(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            return true;
        } else
            return false;
    }

    private static boolean isDigit(char ch) {
        if (ch >= 48 && ch <= 57)
            return true;
        else
            return false;
    }
}