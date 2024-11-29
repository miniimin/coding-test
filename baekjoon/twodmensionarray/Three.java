package twodmensionarray;

import java.io.*;

public class Three {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[][] arr = new String[5][15];

        for (int i = 0; i < 5; i++) {
            String st = br.readLine();
            for (int j = 0; j < st.length(); j++) {
                arr[i][j] = String.valueOf(st.charAt(j));
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] != null) sb.append(arr[j][i]);
            }
        }
        System.out.println(sb);
    }
}