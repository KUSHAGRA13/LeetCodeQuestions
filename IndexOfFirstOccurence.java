import java.util.Scanner;

public class IndexOfFirstOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(strStr(str1,str2));
    }

    public static int strStr(String haystack, String needle) {
        int p=0, i;
        for(i=0;i<haystack.length();i++) {
            if(needle.charAt(p) == haystack.charAt(i))
                p++;
            else {
                if (p>0) { i= i-p; }
                p=0;
            }
            if(p==needle.length()) {
                i++;
                break;
            }
        }
        if(p==needle.length()) {
            return i-p;
        }
        return -1;
    }
}
