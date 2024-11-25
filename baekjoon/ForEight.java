import java.io.*;

class ForEight {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++) {
            String[] na = br.readLine().split(" ");
            int one = Integer.parseInt(na[0]);
            int two = Integer.parseInt(na[1]);
            sb.append(String.format("Case #%d: %d + %d = %d\n", i, one, two, (one + two)));
        }
        System.out.print(sb.toString());
    }
}
