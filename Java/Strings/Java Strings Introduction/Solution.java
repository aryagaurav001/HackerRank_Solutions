import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String A = sc.next();
            String B = sc.next();
            /* Enter your code here. Print output to STDOUT. */

            System.out.println(A.length() + B.length());
            if (A.trim().charAt(0) > B.trim().charAt(0)) {
                System.out.println("Yes");

                char ch1 = B.trim().charAt(0);
                String temp1 = (char) (ch1 - 32) + B.substring(1);

                char ch = A.trim().charAt(0);
                String temp = (char) (ch - 32) + A.substring(1);

                System.out.println(temp + " " + temp1);
            } else {
                System.out.println("No");
                char ch = A.trim().charAt(0);
                String temp = (char) (ch - 32) + A.substring(1);
                char ch1 = B.trim().charAt(0);
                String temp1 = (char) (ch1 - 32) + B.substring(1);
                System.out.println(temp + " " + temp1);
            }

        }

    }
}