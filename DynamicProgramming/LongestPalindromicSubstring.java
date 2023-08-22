package DynamicProgramming;

import java.util.Scanner;

/**
 * Q5
 * Try to solve this question using Dynamic Programming
 */
public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(new LongestPalindromicSubstring().longestPalindrome(str));
    }

    public String longestPalindrome(String str) {
        String leftString = "";
        String palindrome = "";
        for (int i=0;i<str.length();i++) {
            String newPalindrome = ""+str.charAt(i);
            //Add the condition to check if it is possible to create a palindrome from left substring
            int k= leftString.length()-1;
            for(;k>=0;k--){
                if(str.charAt(i) ==leftString.charAt(k)) {
                    newPalindrome = leftString.charAt(k) + newPalindrome;
                }
                else
                    break;
            }

            for (int j = i + 1; j < str.length() && k >= 0;j++, k--){
                if (str.charAt(j) == leftString.charAt(k)) {
                    newPalindrome = leftString.charAt(k) + newPalindrome + str.charAt(j);
                } else
                    break;
            }
            if(palindrome.length()<newPalindrome.length()) {
                palindrome = newPalindrome;
            }
            leftString = leftString + str.charAt(i);
        }
        return palindrome;
    }
}
