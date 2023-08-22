package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    List<String> result;
    public static void main(String[] args) {
        List<String> res = new GenerateParenthesis().generateParenthesis(0);
        res.forEach(System.out::println);
    }

    public List<String> generateParenthesis(int n) {
        result = new ArrayList<>();
        int opening = n-1, closing =n;
        String str = "(";
        generate(str,opening,closing);
        return result;
    }

    private void generate(String str, int opening, int closing) {
        if(opening>closing)
            return;
        if(opening<0)
            return;
        if(opening ==0 && closing==0) {
            result.add(str);
            return;
        }

        generate(str+"(", opening-1,closing);
        generate(str+")",opening,closing-1);
    }
}
