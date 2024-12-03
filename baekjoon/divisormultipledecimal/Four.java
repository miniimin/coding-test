package divisormultipledecimal;

import java.io.*;
import java.util.StringTokenizer;

public class Four {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());

            if (num == 1) {
                n--;
                continue;
            }

            for (int i = 2; i < num; i++){
                if (num % i == 0) {
                    n--;
                    break;
                }
            }
        }
        System.out.println(n);
    }
}