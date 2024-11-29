package twodmensionarray;

import java.io.*;
import java.util.*;

public class Two {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];
        int max = 0;
        int n = 0;
        int m = 0;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] >= max) {
                    n = i + 1;
                    m = j + 1;
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
        System.out.println(n + " " + m);
    }
}