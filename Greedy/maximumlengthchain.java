import java.util.Arrays;
import java.util.Comparator;

public class maximumlengthchain {
    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        // Step 1: Sort pairs based on their second value (end value)
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));

        // Step 2: Initialize
        int chainLen = 1;
        int chainEnd = pairs[0][1];

        // Step 3: Build the chain
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > chainEnd) {
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }

        System.out.println("Max length of chain = " + chainLen);
    }
}
