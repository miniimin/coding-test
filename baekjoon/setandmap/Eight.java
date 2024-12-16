package setandmap;

import java.util.*;
import java.io.*;

public class Eight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = input.length();

        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j + i < n; j++) {
                set.add(input.substring(j, j + i + 1));
            }
        }
        System.out.println(set.size());
    }
}