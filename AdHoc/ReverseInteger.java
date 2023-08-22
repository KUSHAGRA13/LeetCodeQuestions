package AdHoc;

import java.util.Scanner;

public class ReverseInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println( new ReverseInteger().reverse(number));
    }
    public int reverse(int number) {
        long newNumber =0;
        boolean negative = false;
        if(number == Integer.MIN_VALUE)
            return 0;

        if(number<0) {
            negative = true;
            number = number*-1;
        }
        while(number>0) {
            int mod = number%10;
            newNumber = newNumber*10 + mod;
            if(newNumber>Integer.MAX_VALUE) {
                newNumber =0;
                break;
            }
            number = number/10;
        }
        if(negative)
            newNumber = -1*newNumber;
        return (int)newNumber;
    }
}
