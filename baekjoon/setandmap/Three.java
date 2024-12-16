package setandmap;

import java.io.*;
import java.util.*;

public class Three {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        Map<String, String> map = new TreeMap<>(Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            map.put(input.split(" ")[0], input.split(" ")[1]);
        }

        for (Map.Entry<String, String> entry: map.entrySet()) {
            if (entry.getValue().equals("enter")) sb.append(entry.getKey()).append("\n");
        }

        System.out.println(sb);
    }
}