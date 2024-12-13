package setandmap;

import java.io.*;
import java.util.*;

public class One {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Set<Integer> set = new HashSet<>();

        while (n-- > 0) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int x = Integer.parseInt(st2.nextToken());
            sb.append(set.contains(x)? 1 : 0).append(" ");
        }

        System.out.println(sb);
    }
}