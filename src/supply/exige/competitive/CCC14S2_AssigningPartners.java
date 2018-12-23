package supply.exige.competitive;

import supply.exige.competitive.utils.Reader;

import java.io.IOException;
import java.util.HashMap;

public class CCC14S2_AssigningPartners {

    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();

        int N = reader.nextInt();

        HashMap<String, String> partners = new HashMap<String, String>();
        String[] list1 = reader.readLine().trim().split("\\s+");
        String[] list2 = reader.readLine().trim().split("\\s+");
        boolean good = true;

        // Check for dupes
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                if (i == k) continue;
                if (list1[i] == list1[k]) {
                    good = false;
                    break;
                }

                if (list2[i] == list2[k]) {
                    good = false;
                    break;
                }
            }
        }

        // Put into map
        for (int i = 0; i < N; i++) {
            if (good && list1[i].equals(list2[i])) { // Check for same-same partnership
                good = false;
                break;
            }
            partners.put(list1[i], list2[i]);
        }

        // Check for inconsistencies
        for (int i = 0; i < N; i++) {
            if (good && partners.get(list1[i]).equals(partners.get(partners.get(list2[i])))){
                continue;
            }
            good = false;
        }

        System.out.println((good) ? "good" : "bad");
    }
}
