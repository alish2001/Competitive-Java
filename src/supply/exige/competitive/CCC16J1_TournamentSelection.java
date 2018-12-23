package supply.exige.competitive;

import supply.exige.competitive.utils.Reader;

import java.io.IOException;

public class CCC16J1_TournamentSelection {
    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();
        int win = 0;
        for (int i = 0; i < 6; i++) {
            if (reader.readLine().contains("W")) win++;
        }

        if (win == 5 || win == 6) {
            System.out.println("1");
        } else if (win == 3 || win == 4) {
            System.out.println("2");
        } else if (win == 1 || win == 2) {
            System.out.println("3");
        } else {
            System.out.println("-1");
        }
    }
}
