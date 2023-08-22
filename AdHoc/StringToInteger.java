package AdHoc;

import java.util.Scanner;

/**
 * Q8
 */
public class StringToInteger {

    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            System.out.println(new StringToInteger().myAtoi(str));
        }

    }

    public int myAtoi(String str) {
        int i = 0, result = 0;
        long tempResult = 0;
        boolean isNegative = false;
        for (; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                continue;
            else if (str.charAt(i) == '-') {
                isNegative = true;
                i++;
                break;
            } else if (str.charAt(i) == '+') {
                isNegative = false;
                i++;
                break;
            } else
                break;
        }
        if (i == str.length())
            return result;
        for (; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                tempResult = tempResult * 10 + (str.charAt(i) - 48);
                if(!isNegative) {
                    if (tempResult >= Integer.MAX_VALUE) {
                        result = Integer.MAX_VALUE;
                        break;
                    } else {
                        result = (int) tempResult;
                    }
                }
                else {
                    if (-1 * tempResult <= Integer.MIN_VALUE) {
                        result = Integer.MIN_VALUE;
                        break;
                    } else {
                        result = (int) (-1 * tempResult);
                    }
                }
            } else
                break;
        }
        return result;
    }
}
