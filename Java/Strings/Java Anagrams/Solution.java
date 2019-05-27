import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String str1, String str2) {
        java.util.Map<String, Integer> charCountMap1 = countChars(str1);
        java.util.Map<String, Integer> charCountMap2 = countChars(str2);

        if (charCountMap1.equals(charCountMap2)) {
            return true;
        } else {
            return false;
        }
    }

    private static java.util.Map<String, Integer> countChars(String str) {
        java.util.Map<String, Integer> charCountMap = new java.util.HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.toLowerCase().charAt(i);
            if (!charCountMap.containsKey(ch + "")) {
                charCountMap.put(ch + "", 1);
            } else {
                for (java.util.Map.Entry<String, Integer> entry : charCountMap.entrySet()) {
                    String key = entry.getKey();
                    if (key.equals(ch + "")) {
                        int value = entry.getValue();
                        charCountMap.put(key, ++value);
                    }
                }
            }

        }
        return charCountMap;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}