package advanced;

import java.io.*;
import java.util.StringTokenizer;

public class Two {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = {1, 1, 2, 2, 2, 8};
        for(int i : arr) {
            sb.append(i - Integer.parseInt(st.nextToken())).append(" ");
        }
        System.out.println(sb);
    }
}