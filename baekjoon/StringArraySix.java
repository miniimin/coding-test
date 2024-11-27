import java.io.*;

public class StringArraySix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26];
        for(int i = 0; i < 26; i++) {
            arr[i] = s.indexOf('a' + i);
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}