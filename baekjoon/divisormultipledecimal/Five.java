package divisormultipledecimal;

import java.io.*;

public class Five {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = 0;

        for (int num = m; num <= n; num++) {

            if (num == 1) continue;

            if (num == 2) {
                sum = num;
                min = num;
            }

            for (int i = 2; i < num; i++) {
                if (num % i == 0) break;
                if (i == num - 1) {
                    sum += num;
                    if (min == 0) min = num;
                }
            }

        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

    }
}