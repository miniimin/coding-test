package divisormultipledemical2;

import java.io.*;
import java.util.*;

public class Three {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a1, b1 ,a2 ,b2;
        int numerator, denominator;

        StringTokenizer st = new StringTokenizer(br.readLine());
        a1 = Integer.parseInt(st.nextToken());
        b1 = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        a2 = Integer.parseInt(st2.nextToken());
        b2 = Integer.parseInt(st2.nextToken());

        numerator = a1 * b2 + a2 * b1;
        denominator = b1 * b2;

        int a = numerator;
        int b = denominator;

        // 최대공약수 구하기(유클리드 호제법)
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        numerator /= a;
        denominator /= a;

        System.out.println(numerator + " " + denominator);
    }
}