package bruteforce;

import java.io.*;
import java.util.StringTokenizer;

public class One {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int max = 0;

        int[] arr = new int[n];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (i != j && j != k && i != k) {
                        int sum = arr[i] + arr[j] + arr[k];
                        if (sum > max && sum <= m) {
                            max = sum;
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}