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

        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        List<String> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            if (set.contains(input)) {
                list.add(input);
            }
        }

        Collections.sort(list);

        for (String s : list) {
            sb.append(s).append("\n");
        }

        System.out.println(list.size());
        System.out.println(sb);
    }
}