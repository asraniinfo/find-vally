package net.ankit.count.vally;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountVally {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int level = 0;
        int vally = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'U') {
                level++;
            } else if (ch == 'D') {
                if (level == 0) {
                    vally++;
                }
                level--;
            }
        }
        return vally;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
