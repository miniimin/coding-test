package bruteforce;

import java.io.*;

public class Two {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;

        for (int i = 1; i < n; i++) {
            int sum = 0;

            /*
            for (int j = 1; j < 7; j++) {
                sum += (i % (int)Math.pow(10, j) - sum) / (int)Math.pow(10, j - 1);
                if (i / (int)Math.pow(10, j) == 0) {
                    break;
                }
            } */
            /*for (char c : String.valueOf(i).toCharArray()) {
                sum += c - '0';
            } */ // 메모리 훨씬 많이 소모

            for (int num = i; num > 0; num /= 10) {
                sum += num % 10; // 각 자릿수를 더함
            }
            sum += i;
            if (sum == n) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}