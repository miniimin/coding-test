package sorting;

import java.io.*;

public class Two {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int avg = 0;

        for (int i = 0; i < 5; i++) {
            int n = Integer.parseInt(br.readLine());
            avg += n;
            arr[i] = n;
        }
        avg /= 5;

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                int min = Integer.MAX_VALUE;
                if(min > arr[j]) min = arr[j];
                if (min < arr[i]) {
                    arr[j] = arr[i];
                    arr[i] = min;
                }
            }
        }

        System.out.println(avg);
        System.out.println(arr[2]);
    }
}