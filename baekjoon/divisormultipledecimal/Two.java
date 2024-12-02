package divisormultipledecimal;

import java.io.*;
import java.util.StringTokenizer;

public class Two {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (n % (n - i) == 0) {
                sb.append(n - i).append(" ");
            }
        }
        String[] arr = sb.toString().split(" ");
        if (arr.length >= k) {
            System.out.println(Integer.parseInt(arr[arr.length - k]));
        } else {
            System.out.println(0);
        }
    }
}