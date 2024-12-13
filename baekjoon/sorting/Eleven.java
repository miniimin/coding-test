package sorting;

import java.io.*;
import java.util.*;

public class Eleven {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            set.add(arr[i]);
        }

        Map<Integer, Integer> map = new HashMap<>();
        int rank = 0;
        for (int x : set) {
            map.put(x, rank++);
        }

        for (int i = 0; i < n; i++) {
            arr[i] = map.get(arr[i]);
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);
    }
}