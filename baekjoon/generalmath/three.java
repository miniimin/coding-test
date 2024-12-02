package generalmath;

import java.io.*;

public class three {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int c = Integer.parseInt(br.readLine());
            int q = c / 25;
            c = c % 25;
            int d = c / 10;
            c = c % 10;
            int n = c / 5;
            c = c % 5;
            int p = c;

            sb.append(q).append(" ").append(d).append(" ").append(n).append(" ").append(p).append("\n");
        }
        System.out.print(sb);
    }
}
