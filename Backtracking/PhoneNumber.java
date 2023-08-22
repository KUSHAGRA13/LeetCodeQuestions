package Backtracking;

import java.util.*;

public class PhoneNumber {

    public static void main(String[] args) {
        System.out.println(150000 + 62500 + 50000 + 37500 + 25000 + 12500);
        //List<String> result = new PhoneNumber().letterCombinations("234");
           // result.forEach(System.out::println);
    }

    List<String> result ;

    public List<String> letterCombinations(String digits) {

        result = new ArrayList<>();
        Map<Integer, String> mp = new HashMap<>();
        mp.put(2, "abc");
        mp.put(3, "def");
        mp.put(4, "ghi");
        mp.put(5, "jkl");
        mp.put(6, "mno");
        mp.put(7, "pqrs");
        mp.put(8, "tuv");
        mp.put(9, "wxyz");

        solve("", digits, mp, 0);
        return result;
    }

    private void solve (String str, String digits, Map<Integer, String> mp, int length) {
        if(str.length() == digits.length()) {
            result.add(str);
            return;
        }
        int size = mp.get(digits.charAt(length)-48).length();
        for(int i=0;i<size;i++) {
            solve(str+mp.get(digits.charAt(length)-48).charAt(i),digits,mp, length+1 );
        }
    }
}
