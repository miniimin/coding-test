package sorting;

import java.io.*;

public class Five {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];

        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 0; i < 10001; i++) {
            sb.append((i + "\n").repeat(arr[i]));
        }
        System.out.println(sb);
    }
}