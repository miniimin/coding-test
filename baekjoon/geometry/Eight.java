package geometry;

import java.io.*;
import java.util.*;

public class Eight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;
        int sum = 0;

        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            if (n > max) {
                max = n;
            }
            sum += n;
        }

        if (sum - max > max) {
            System.out.println(sum);
        } else {
            System.out.println(sum - max + sum - max - 1);
        }
    }
}