import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String str, int k) {
            
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
       
        int n = str.length() - k + 1;
        String[] substrings = new String[n];
        for (int i = 0; i < n; i++) {
            substrings[i] = str.substring(i, i + k);
        }

        String smallest = substrings[0];
        String largest = substrings[0];

        for (int i = 1; i < substrings.length; i++) {
            String temp = substrings[i];
            if (smallest.compareTo(temp) > 0) {
                smallest = temp;
            }
            if(largest.compareTo(temp) < 0) {
                largest = temp;
            }
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}