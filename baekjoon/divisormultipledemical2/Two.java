package divisormultipledemical2;

import java.util.*;
import java.io.*;

public class Two {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long gcd = getGCD(a, b);

        long lcm = (a / gcd) * b;

        System.out.println(lcm);
    }

    public static long getGCD(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
            System.out.println("a: " + a);
            System.out.println("b: " + b);
        }
        return a;
    }
}