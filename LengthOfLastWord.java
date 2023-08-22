import java.util.Scanner;

public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

    public static int lengthOfLastWord(String s) {
        Scanner sc = new Scanner(s);
        String str = "";
        while(sc.hasNext()) {
            str = sc.next();
        }
        return str.length();
    }
}
