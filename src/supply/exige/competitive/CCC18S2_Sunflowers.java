package supply.exige.competitive;

import supply.exige.competitive.utils.Reader;

import java.io.IOException;

public class CCC18S2_Sunflowers {

    public static void main(String[] args) throws IOException {
        Reader r = new Reader();

        // Store input
        int N = r.nextInt();
        int[] data = new int[N * N];
        for (int i = 0; i < N * N; i++) {
            data[i] = r.nextInt();
        }

        legitimize(data, N); // Correct input

        // display
        for (int y = 0; y < N; y++) {
            for (int x = 0; x < N; x++) {
                System.out.print(data[x + y * N]);
            }
            System.out.println();
        }
    }

    public static void legitimize(int[] data, int N) {
        while (!isLegit(data, N)) rotateArray(data, 1, N);
    }

    public static boolean isLegit(int[] data, int N) {
        for (int y = 0; y < N; y++) {
            for (int x = 0; x < N; x++) {
                // Check row order
                if (!(x >= N - 1 || data[get2DIndex(x, y, N)] < data[get2DIndex(x + 1, y, N)])) return false;
                if (!(y >= N - 1 || data[get2DIndex(x, y, N)] < data[get2DIndex(x, y + 1, N)])) return false;
            }
        }
        return true;
    }

    /**
     * Rotates a 1D array based on multiples of 90
     */
    public static void rotateArray(int[] array, int multiple, int N) { // Clockwise
        int[] og = array.clone();
        for (int y = 0; y < N; y++) {
            for (int x = 0; x < N; x++) {
                int x_RotationalIndex;
                int y_RotationalIndex;

                if (multiple == 1) {
                    x_RotationalIndex = y;
                    y_RotationalIndex = N - 1 - x;
                    array[x + y * N] = og[x_RotationalIndex + y_RotationalIndex * N];
                } else if (multiple == 3) {
                    x_RotationalIndex = N - 1 - y;
                    y_RotationalIndex = x;
                    array[x + y * N] = og[x_RotationalIndex + y_RotationalIndex * N];

                } else if (multiple == 2) {
                    x_RotationalIndex = N - 1 - x;
                    y_RotationalIndex = N - 1 - y;
                    array[x + y * N] = og[x_RotationalIndex + y_RotationalIndex * N];
                }
            }
        }
    }

    public static int get2DIndex(int x, int y, int N) {
        return x + y * N;
    }
}