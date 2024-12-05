package timecomplexity;

import java.io.*;

public class Six {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        /*
        int count = 0;

        for (int i = 1; i < n - 1; i++){
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n + 1; k++) {
                    count++;
                }
            }
        }
        */

        System.out.println(n * (n - 1) * (n - 2) / 6);
        System.out.println(3);
    }
}