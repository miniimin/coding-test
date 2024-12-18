package divisormultipledemical2;

import java.io.*;

public class One {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            int a = Integer.parseInt(input.split(" ")[0]);
            int b = Integer.parseInt(input.split(" ")[1]);

            int min = Math.min(a, b);
            int max = 1;

            for (int j = 2; j <= min; j++) {
                if (a % j == 0 && b % j == 0) max = j;
            }
            sb.append((a / max) * (b / max) * max).append("\n");
        }
        System.out.print(sb);
    }
}