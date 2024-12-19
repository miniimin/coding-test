package divisormultipledemical2;

import java.io.*;

public class Four {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] gaps = new int[n - 1];

        int a = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < n - 1; i++) {
            int b = Integer.parseInt(br.readLine());
            gaps[i] = b - a;
            sum += gaps[i];
            a = b;
        }

        int gcd = gaps[0];

        for (int i = 1; i < gaps.length; i++) {
            gcd =findGCD(gcd, gaps[i]);
        }

        int totalTreesNeeded = (sum / gcd) + 1 - n;
        System.out.println(totalTreesNeeded);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}