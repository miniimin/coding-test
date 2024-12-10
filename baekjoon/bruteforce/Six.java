package bruteforce;

import java.io.*;

public class Six {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = Integer.MAX_VALUE;;

        for (int i = 0; i <= 5000 / 3; i++) {
            for (int j = 0; j <= 5000 / 5; j++) {
                if (i * 3 + j * 5 == n) {
                    answer = Math.min(answer, i + j);
                }
            }
        }
        if (answer == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }
    }
}