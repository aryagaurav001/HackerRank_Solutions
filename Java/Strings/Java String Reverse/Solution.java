import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        if (isPalindrome(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean isPalindrome(String str) {
        int n = str.length();
        boolean found = true;
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                found = false;
                break;
            }
        }

        if (found == true) {
            return true;
        } else {
            return false;
        }

    }
}