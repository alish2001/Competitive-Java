package supply.exige.competitive.ccc2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1 {

    static int[] numbers = {1, 2,
                            3, 4};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String input = st.nextToken();

        char[] inputArray = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            inputArray[i] = (input.charAt(i));
        }

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == 'H') horizontalFlip(numbers);
            if (inputArray[i] == 'V') verticalFlip(numbers);
        }

        System.out.println(numbers[0] + " " + numbers[1]);
        System.out.println(numbers[2] + " " + numbers[3]);
    }

    public static void verticalFlip(int[] input) {
        int[] og = input.clone();
        input[0] = og[1];
        input[2] = og[3];
        input[3] = og[2];
        input[1] = og[0];
    }

    public static void horizontalFlip(int[] input) {
        int[] og = input.clone();
        input[0] = og[2];
        input[1] = og[3];
        input[2] = og[0];
        input[3] = og[1];
    }
}
