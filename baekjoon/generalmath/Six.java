package generalmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Six {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int limit = 1;
        int i = 1;

        while (n > limit) {
            i++;
            limit = limit + i;
        }

        // 레이어에서 몇번째 숫자인지
        int x = n - (limit - i);

        if (i % 2 == 0) {
            System.out.println(x + "/"  + (i + 1 - x));
        } else {
            System.out.println((i + 1 - x) + "/" + x);
        }
    }
}
