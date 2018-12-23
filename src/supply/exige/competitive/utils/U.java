package supply.exige.competitive.utils;

public class U {

    /**
     * @param n input integer
     * @return number of digits the input has
     */
    public static int getNumberofDigits(int n) {
        return (int) Math.floor(Math.log10(n)) + 1;
    }

    /**
     * Method to check if x is power of 2
     * @param x input
     * @return isPowerOfTwo
     */
    public static boolean isPowerOfTwo(int x) {
     /* First x in the below expression is
     for the case when x is 0 */
        return x != 0 && ((x & (x - 1)) == 0);
    }
}
