package sorting;

import java.io.*;
import java.util.*;

public class Nine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        // String[] arr = new String[n];

        TreeSet<String> set = new TreeSet<>((a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            }
            return Integer.compare(a.length(), b.length());
        });

        for (int i = 0; i < n; i++) {
            // arr[i] = br.readLine();
            set.add(br.readLine());
        }

        /*
        Arrays.sort(arr, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            } else {
                return Integer.compare(a.length(), b.length());
            }
        });

        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append("\n");
        }
         */

        for (String str : set) {
            sb.append(str).append("\n");
        }
        System.out.println(sb);
    }
}