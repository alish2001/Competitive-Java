package supply.exige.competitive;

import supply.exige.competitive.utils.Reader;
import supply.exige.competitive.utils.U;

import java.io.IOException;

public class DMOPC14C1P3_NewStudents {
    public static void main(String[] args) throws IOException {
        Reader r = new Reader();

        double avg = 0;
        int initialStudents = r.nextInt();

        for (int i = 0; i < initialStudents; i++){ // Add all current averages
            avg += r.nextInt();
        }

        int transferStudents = r.nextInt();

        for (int i = 0; i < transferStudents; i++){ // Add all current averages
            avg += r.nextInt();
            System.out.println(U.roundFloatingPointError(avg/(initialStudents+i+1), 3)); // print average at this transferpoint
        }

        System.exit(0);
    }
}
