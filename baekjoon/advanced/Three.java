package advanced;

import java.io.*;

public class Three {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= 2 * n - 1; i++) {
            if(i <= n) System.out.println(" ".repeat(n - i) + "*".repeat(2 * i - 1));
            else System.out.println(" ". repeat(i - n) + "*".repeat((2 * n - i) * 2 - 1));
        }
    }
}