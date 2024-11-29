package twodmensionarray;

import java.io.*;

public class Four {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] dohwaji = new boolean[100][100];
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            String st = br.readLine();
            int x = Integer.parseInt(st.split(" ")[0]);
            int y = Integer.parseInt(st.split(" ")[1]);
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (!dohwaji[j][k]) {
                        dohwaji[j][k] = true;
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}