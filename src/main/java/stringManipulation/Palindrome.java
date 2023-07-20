package stringManipulation;

import java.util.Locale;

public class Palindrome {

    public static boolean isPalindrome(String s) {
        int n = s.length();
        String str = s.trim().toLowerCase(Locale.ROOT);
        for (int i = 0; i < n/2; i++) {
            if (str.charAt(i) != str.charAt(n-i-1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome plm = new Palindrome();
        boolean palindrome1 =plm.isPalindrome("RaceCar");
        System.out.println(palindrome1);

    }

}
