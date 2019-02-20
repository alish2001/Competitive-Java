package supply.exige.competitive.ccc2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3 {

    public static int numOfInput;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String initialLine = br.readLine();
        StringTokenizer st = new StringTokenizer(initialLine);

        numOfInput = st.countTokens();

        int[][] input = new int[3][numOfInput];

        for (int j = 0; j < 3; j++) {
            StringTokenizer stringTokenizer;
            if (j == 0) {
                stringTokenizer = new StringTokenizer(initialLine);
            } else {
                stringTokenizer = new StringTokenizer(br.readLine());
            }

            for (int i = 0; i < numOfInput; i++) {
                String token = stringTokenizer.nextToken();
                if (token.equalsIgnoreCase("X")) {
                    input[j][i] = -1000001;
                } else {
                    input[j][i] = Integer.parseInt(token);
                }
                //−1 000 001 is X
            }
        }

        while (!isLegit(input))
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < numOfInput; i++) {
                    if (input[j][i] == -1000001) {
                        System.out.print("X");
                    } else {
                        System.out.print(input[j][i]);
                    }
                    System.out.print(" ");
                }
                System.out.print("\n");
            }


        // Print
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < numOfInput; i++) {
                if (input[j][i] == -1000001) {
                    System.out.print("X");
                } else {
                    System.out.print(input[j][i]);
                }
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static boolean isLegit(int[][] input) {
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < numOfInput; i++) {
                if (input[j][i] == -1000001) return false;
            }
        }
        return true;
    }

    public static void legitimize(int[][] input) {
        for (int j = 0; j < 3; j++) {
            int t = -1111111111;
            for (int i = 0; i < numOfInput; i++) {
                if (i > 0 && input[j][i-1] != -1000001 && input[j][i] != -1000001){
                    if (t != -1111111111) {
                        t = input[j][i] - input[j][i - 1];
                        }
                    } else {


                }
            }
        }
    }
}
