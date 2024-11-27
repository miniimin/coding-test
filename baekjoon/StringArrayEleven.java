import java.io.*;

public class StringArrayEleven {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            String st = br.readLine();
            if (st == null || st.isEmpty()) break;
            sb.append(st).append('\n');
        }
        System.out.println(sb);
    }
}