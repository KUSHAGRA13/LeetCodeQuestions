package AdHoc;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        new Palindrome().isPalindrome(t);
    }
    public boolean isPalindrome(int number) {
        String str = number+"";
        int rev = str.length()-1;
        for(int i=0;i<str.length()/2;i++) {
            if(str.charAt(i)!=str.charAt(rev))
                return false;
            rev--;
        }
        return true;
    }
}
