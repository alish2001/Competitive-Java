package supply.exige.competitive;

import supply.exige.competitive.utils.Reader;

import java.io.IOException;

public class AMinusB {

    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();
        int numOfProblems = reader.nextInt();
        StringBuilder solved = new StringBuilder();
        for (int i = 0; i < numOfProblems; i++) {
            solved.append(reader.nextInt() - reader.nextInt());
            solved.append("\n");
        }
        System.out.println(solved);
    }
}