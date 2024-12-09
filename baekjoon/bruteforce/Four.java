package bruteforce;

import java.io.*;

public class Four {

    static String white = "W";
    static String black = "B";

    static String[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int n = Integer.parseInt(st.split(" ")[0]);
        int m = Integer.parseInt(st.split(" ")[1]);

        int min = Integer.MAX_VALUE;

        arr = new String[n][m];

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = input.split("")[j];
            }
        }

        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                min = Math.min(min, count(i, j));
            }
        }
        System.out.println(min);
    }

    static int count(int a, int b) {
        int sum = 0;
        for (int i = a; i < a + 8; i++) {
            for (int j = b; j < b + 8; j++) {
                if ((i + j) % 2 == 0) {
                    if (arr[i][j].equals(white)) sum++;
                } else if ((i + j) % 2 != 0) {
                    if (arr[i][j].equals(black)) sum++;
                }
            }
        }
        return Math.min(sum, 64 - sum);
    }
}