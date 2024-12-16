package setandmap;

import java.util.*;
import java.io.*;

public class Two {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input.split(" ")[0]);
        int m = Integer.parseInt(input.split(" ")[1]);
        int count = 0;

        /*
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < m; i++) {
            String word = br.readLine();
            for (int j = 0; j < n; j++) {
                if (word.equals(arr[j])) {
                    count++;
                    break;
                }
            }
        }*/
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(br.readLine(), 0);
        }

        for (int i = 0; i < m; i++) {
            if (map.containsKey(br.readLine())) count++;
        }

        System.out.println(count);
    }
}