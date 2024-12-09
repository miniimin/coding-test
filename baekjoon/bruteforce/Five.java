package bruteforce;

import java.io.*;

public class Five {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 1;  ; i++) {
            if (Integer.toString(i).contains("666")) {
                count++;
            }
            if (count == n) {
                System.out.println(i);
                break;
            }
        }
    }
}