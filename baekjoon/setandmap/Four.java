package setandmap;

import java.util.*;
import java.io.*;

public class Four {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<String, String> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            String input = br.readLine();
            map.put(input, i + "");
            map.put(i + "", input);
        }

        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            sb.append(map.get(input)).append("\n");
        }
        System.out.println(sb);
    }
}