import java.io.*;

public class StringArrayNine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int one = Integer.parseInt(sb1.append(st[0].charAt(2)).append(st[0].charAt(1)).append(st[0].charAt(0)).toString());
        int two = Integer.parseInt(sb2.append(st[1].charAt(2)).append(st[1].charAt(1)).append(st[1].charAt(0)).toString());
        int max = Math.max(one, two);
        System.out.println(max);
    }
}
