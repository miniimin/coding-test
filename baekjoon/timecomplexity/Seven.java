package timecomplexity;

import java.io.*;
import java.util.StringTokenizer;

public class Seven {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        /*
        int b = 1;

        for (int i = n0; i <= 100; i++) {
            int f = a1 * i + a0;
            int g = c * i;
            if (f - g > 0) {
                b = 0;
                break;
            }
        }
        System.out.println(b);
         */
        // f(n) = a1 * n + a0
        // 조건: (a1 - c) * n <= -a0
        if (a1 <= c) {
            // n0에서 조건 확인
            if ((a1 - c) * n0 + a0 <= 0) {
                System.out.println(1); // O(n)을 만족
            } else {
                System.out.println(0); // 만족하지 않음
            }
        } else {
            System.out.println(0); // a1 > c인 경우 성립하지 않음
        }
    }
}