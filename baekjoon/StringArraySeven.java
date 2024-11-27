import java.io.*;
public class StringArraySeven {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder p = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] st = br.readLine().split(" ");
            int r = Integer.parseInt(st[0]);
            String s = st[1];
            for (int j = 0; j < s.length(); j++) {
                p.append(String.valueOf(s.charAt(j)).repeat(r));
            }
            p.append('\n');
        }
        System.out.println(p);
    }
}