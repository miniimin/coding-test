package advanced;

import java.io.*;

public class Five {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int[] arr = new int[26];
        for (char c : st.toCharArray()) {
            if (c <= 'Z') {
                arr[c - 'A'] += 1;
            }else  {
                arr[c - 'a'] += 1;
            }
        }
        int max = 0;
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                num = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i] && i != num) {
                System.out.println("?");
                return;
            }
        }
        System.out.println((char)('A' + num));
    }
}