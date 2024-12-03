package divisormultipledecimal;

import java.io.*;

public class Three {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;
            sb.append(n).append(" ");

            int[] arr = new int[n];
            int sum = 0;

            for(int i = 1; i < n; i++) {
                if (n % i == 0) {
                    arr[i] = 1;
                    sum += i;
                    if (sum > n) break;
                }
            }

            if (sum == n) {
                sb.append("= 1");
                for(int i = 2; i < arr.length; i++) {
                    if(arr[i] != 0) sb.append(" + ").append(i);
                }
                sb.append("\n");
            }else {
                sb.append("is NOT perfect.\n");
            }
        }
        System.out.print(sb);
    }
}