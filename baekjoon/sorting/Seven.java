package sorting;

import java.io.*;
import java.util.Arrays;

public class Seven {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String input =  br.readLine();
            arr[i][0] = Integer.parseInt(input.split(" ")[0]);
            arr[i][1] = Integer.parseInt(input.split(" ")[1]);
        }
        /*
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i][0] > arr[j][0] || (arr[i][0] == arr[j][0] && arr[i][1] > arr[j][1])) {
                    int temp0 = arr[i][0];
                    int temp1 = arr[i][1];
                    arr[i][0] = arr[j][0];
                    arr[i][1] = arr[j][1];
                    arr[j][0] = temp0;
                    arr[j][1] = temp1;
                }
            }
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
         */
        Arrays.sort(arr, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            } else {
                return Integer.compare(a[0], b[0]);
            }
        });

        for (int i = 0; i < n; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }

        System.out.println(sb);
    }
}