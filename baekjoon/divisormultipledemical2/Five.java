package divisormultipledemical2;

import java.io.*;

public class Five {

    public static boolean isPrime(long n) {
        if (n < 2)  return false;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            long temp = Long.parseLong(br.readLine());
            while(!isPrime(temp)) {
                temp++;
            }
            sb.append(temp).append("\n");
        }
        System.out.print(sb);
    }
}