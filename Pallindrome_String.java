import java.util.*;
public class Pallindrome_String {

    public static void main(String[] args) {
        // String s = "abcddcba";
        // char[] s2 = s.toCharArray();
        // int n = s.length();
        // char[] s1 = new char[n];
        // for (int i = 0; i < n; i++) {
        //     s1[i] = s2[n - i - 1];
        // }

        // if (Arrays.equals(s1, s2)) {
        //     System.out.println("It is a palindrome");
        // } else {
        //     System.out.println("It is not a palindrome");
        // }
        String s = "abcddcba";
        int n = s.length();
        boolean isPalindrome = true; 

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                isPalindrome = false; 
                break; 
            }
        }

        if (isPalindrome) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}
