import java.util.*;
public class Pallindrome_String {

    public static void main(String[] args) {
        String s = "abcddcba";
        char[] s2 = s.toCharArray();
        int n = s.length();
        char[] s1 = new char[n];
        for (int i = 0; i < n; i++) {
            s1[i] = s2[n - i - 1];
        }

        if (Arrays.equals(s1, s2)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}