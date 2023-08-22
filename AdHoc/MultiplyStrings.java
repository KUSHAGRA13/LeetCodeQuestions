package AdHoc;

import java.util.Scanner;

/**
 * Q43
 */
public class MultiplyStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1 = sc.next();
        String num2 = sc.next();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(new MultiplyStrings().multiply(num1, num2));
    }

    public String multiply(String num1, String num2) {
        String ans = "", zero="";
        for (int i=num2.length()-1;i>=0;i--) {
            String temp = ""+ zero;
            int carryOver = 0;
            for (int j=num1.length()-1;j>=0;j--) {
                int mul = (num2.charAt(i)-48)*(num1.charAt(j)-48) + carryOver;
                carryOver = mul/10;
                mul = mul%10;
                temp = mul + temp;
            }
            if(carryOver>0)
                temp = carryOver + temp;
            ans = addition(ans, temp);
            zero=zero+"0";
        }
        return removeTrailingZeros(ans);
    }

    private String removeTrailingZeros(String ans) {
        int i;
        for(i=0;i<ans.length();i++) {
            if(ans.charAt(i)=='0')
                continue;
            else break;
        }
        if(i==ans.length())
            return "0";
        return ans.substring(i,ans.length());
    }

    private String addition(String ans, String temp) {
        String finalAns = "";
        if(ans.equals(""))
            finalAns = temp;
        else {
            int carryOver =0,j,i;
            if(ans.length()<temp.length()) {
                int dif = temp.length()-ans.length();
                ans = trailingZeros(dif) + ans;
            }
            if (temp.length()<ans.length()) {
                int dif  = ans.length()-temp.length();
                temp = trailingZeros(dif) + temp;
            }
            for (i=ans.length()-1,j=temp.length()-1;i>=0&&j>=0;i--,j--) {
                int tempR = (ans.charAt(i)-48) + (temp.charAt(j)-48) + carryOver;
                if(tempR>=10) {
                    carryOver = 1;
                    tempR = tempR-10;
                }
                else {
                    carryOver =0;
                }
                finalAns = tempR+finalAns;
            }
            if(carryOver>0) {
                finalAns = carryOver+finalAns;
            }
        }

        return finalAns;
    }

    private String trailingZeros(int dif) {
        String ans = "";
        for(int i=0;i<dif;i++) {
            ans = "0" + ans;
        }
        return ans;
    }
}
