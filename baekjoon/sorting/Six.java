package sorting;

import java.io.*;
import java.util.Arrays;

public class Six {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();

        int[] arr = new int[input.length()];

        for (int i = 0; i < input.length(); i++) {
            arr[i] = input.charAt(i) - '0';
        }

        Arrays.sort(arr);

        for (int i = 0; i < input.length(); i++) {
            sb.append(arr[input.length() - i - 1]);
        }
        System.out.println(sb);
    }
}