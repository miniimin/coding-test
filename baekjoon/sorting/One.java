package sorting;

import java.io.*;

public class One {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int min = Integer.MAX_VALUE;
                if (min > arr[j]) min = arr[j];
                if (min < arr[i]) {
                    arr[j] = arr[i];
                    arr[i] = min;
                }
            }
            System.out.println(arr[i]);
        }
    }
}