package supply.exige.competitive.ccc2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class S2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] testCases = new int[Integer.parseInt(br.readLine())];
        int maxNum = 0;

        for (int i = 0; i < testCases.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            testCases[i] = Integer.parseInt(st.nextToken());
            if (testCases[i] > maxNum) maxNum = testCases[i];
        }

        List<Integer> primes = createPrimes(maxNum*2);

        for (int i = 0; i < testCases.length; i++) {
            System.out.println(getPrime(testCases[i], primes));
        }
    }

    public static String getPrime(int input, List<Integer> primes) {
        int primesMaxIndex = primes.size() - 1;
        if (primes.contains(input)) return input + " " + input; // If input is a prime
        for (int prime1Index = 0; prime1Index < primesMaxIndex/2; prime1Index++) {
            for (int prime2Index = 0; prime2Index < primesMaxIndex; prime2Index++) {
                int prime1 = primes.get(prime1Index);
                int prime2 = primes.get(prime2Index);

                if ((prime1 + prime2) % 2 != 0) continue;
                int primeOutput = (primes.get(prime1Index) + primes.get(prime2Index)) / 2;

                if (input == primeOutput) return primes.get(prime1Index) + " " + primes.get(prime2Index);
            }
        }
        return "RIP";
    }

    public static List<Integer> createPrimes(int range) {
        List<Integer> primes = new ArrayList<>();
        for (int p = 2; p < range; p++) {
            if (!isDivisible(p, range)) {
                primes.add(p);
            }
        }
        return primes;
    }

    public static boolean isDivisible(int num, int range) {
        for (int i = 2; i < range; i++) {
            if (num % i == 0 && num != i) return true;
        }
        return false;
    }
}