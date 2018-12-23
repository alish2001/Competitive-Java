package supply.exige.competitive;

import supply.exige.competitive.utils.Reader;

import java.io.IOException;

public class SixteenBitSWOnly {

    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();
        int numberOfProblems = reader.nextInt();
        int[] solver = new int[numberOfProblems];
        for (int i = 0; i < numberOfProblems; i++) {
            long result = reader.nextLong() * reader.nextLong();
            long projectedResult = reader.nextLong();

            solver[i] = (projectedResult == result) ? 1 : 0;
        }

        for (int i = 0; i < solver.length; i++) {
            System.out.println(solver[i] == 0 ? "16 BIT S/W ONLY" : "POSSIBLE DOUBLE SIGMA");
        }
    }
}