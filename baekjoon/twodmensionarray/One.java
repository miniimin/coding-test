package twodmensionarray;

import java.io.*;
import java.util.StringTokenizer;

public class One {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();

        int n = Integer.parseInt(input.split(" ")[0]);
        int m = Integer.parseInt(input.split(" ")[1]);

        int[][] arr = new int[n][m];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int k = 0; k < m; k++) {
                    arr[j][k] = arr[j][k] + Integer.parseInt(st.nextToken());
                    if (i == 1) sb.append(arr[j][k]).append(" ");
                }
                if (i == 1) sb.append("\n");
            }
        }
        System.out.print(sb);
    }
}