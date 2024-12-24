package divisormultipledemical2;

import java.io.*;
import java.util.*;

public class Seven {

    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            int count = 0;
            for (int i = n + 1; i <= n * 2; i++) {
                if (isPrime(i)) count++;
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);
    }
}