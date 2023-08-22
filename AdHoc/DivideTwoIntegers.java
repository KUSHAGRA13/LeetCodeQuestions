package AdHoc;

/**
 * Q29
 */
public class DivideTwoIntegers {

    public static void main(String[] args) {
        System.out.println(new DivideTwoIntegers().divide(2147483647, 1));
    }

    public int divide(int dividend, int divisor) {
        int result = 0, orginaldivisor = divisor;
        int factor = 1;
        int quotient = 0;

        if(dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if (dividend < 0) {
            dividend = dividend*-1;
            factor = -1*factor;
        }

        if (divisor < 0) {
            divisor = divisor*-1;
            orginaldivisor = divisor;
            factor = -1*factor;
        }

        int[] factors = new int [32];
        factors[0] =1;
        while (true) {
            if (divisor > dividend) break;
            while (dividend >= divisor) {
                divisor = divisor << 1;
                factors[result] =(int) Math.pow(2, result);
                result++;
            }
            quotient = quotient + (int) Math.pow(2, result - 1);
            dividend = dividend - (divisor >> 1);
            divisor = orginaldivisor;
            result = 0;
        }

        return factor * quotient;
    }
}
