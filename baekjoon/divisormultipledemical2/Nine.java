package divisormultipledemical2;

import java.io.*;
import java.util.*;

public class Nine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /*
        int count = 0;
        boolean[] arr = new boolean[N + 1];
        Arrays.fill(arr, false);

        for (int i = 1; i <= N; i++) {
            for (int j = 1; i * j <= N; j++) {
                arr[i * j] = !arr[i * j];
            }
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]) count++;
        }
         */

        int count = (int) Math.sqrt(N);
        System.out.println(count);
    }
}