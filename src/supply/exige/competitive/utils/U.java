package supply.exige.competitive.utils;

public class U {

    /**
     * Rounds floating point error results to a certain precision degree.
     *
     * @param input     - the input
     * @param precision - the precision degree
     * @return FP-Corrected input at the desired precision degree
     */
    public static double roundFloatingPointError(double input, int precision) {
        input *= Math.pow(10, precision); // Multiply the FP-Errored input by 10 to the precision degree
        input = Math.round(input); // Round the result to the nearest integer
        input /= Math.pow(10, precision); // Shift decimal to original point
        return input; // Return corrected input
    }

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

    /**
     * Rotates a 1D array in 2 dimensions based on multiples of 90
     * @param array 1-Dimensional Array
     * @param multiple multiple of 90 degrees
     * @param width width of the supposed 2D array
     * @param height height of the supposed 2D array
     */
    public static void rotateArray(int[] array, int multiple, int width, int height) { // Clockwise
        int[] og = array.clone();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int x_RotationalIndex = x;
                int y_RotationalIndex = y;

                if (multiple == 1) {
                    x_RotationalIndex = y;
                    y_RotationalIndex = height - 1 - x;
                } else if (multiple == 3) {
                    x_RotationalIndex = width - 1 - y;
                    y_RotationalIndex = x;

                } else if (multiple == 2) {
                    x_RotationalIndex = width - 1 - x;
                    y_RotationalIndex = height - 1 - y;
                }

                array[get2DIndex(x, y, width)] = og[get2DIndex(x_RotationalIndex, y_RotationalIndex, width)];
            }
        }
    }

    public static int get2DIndex(int x, int y, int N) {
        return x + y * N;
    }
}
