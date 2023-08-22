import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class RepeatedSubString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(repeatedSubstringPattern(str));

    }

    public static boolean repeatedSubstringPattern(String s) {
        if (s.length()==1) {
            return false;
        }
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
        }

        Iterator<Map.Entry<Character, Integer>> itr = hm.entrySet().iterator();

        Map.Entry<Character, Integer> entry = itr.next();
        int value = entry.getValue();

        while (itr.hasNext()) {
            if(value != itr.next().getValue()) {
                return false;
            }
        }
        return true;
    }
}
