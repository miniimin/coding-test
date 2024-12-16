package setandmap;

import java.io.*;
import java.util.*;

public class Six {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;

        Map<String, Integer> map = new TreeMap<>(Comparator.naturalOrder());

        for (int i = 0; i < n; i++) {
            map.put(br.readLine(), 0);
        }

        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            if (map.containsKey(input)) {
                sb.append(input).append("\n");
                count++;
            }
        }

        System.out.println(count);
        System.out.print(sb);
    }
}