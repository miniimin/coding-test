package divisormultipledemical2;

import java.io.*;
import java.util.*;

public class Eight {

    public static void main(String[] args) throws IOException {
        boolean[] arr = new boolean[1000001];
        Arrays.fill(arr, true);
        arr[0] = arr[1] = false;

        for (int i = 2; i * i<= 1000000; i++) {
            if (arr[i]) {
                for (int j = i * i; j <= 1000000; j += i) {
                    arr[j] = false;
                }
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int count = 0;

            for (int i = 2; i <= N / 2; i++) {
                if (arr[i] && arr[N - i]) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }

        System.out.print(sb);
    }
}