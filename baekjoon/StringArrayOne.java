import java.io.*;

public class StringArrayOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int i = Math.abs(Integer.parseInt(br.readLine()));
        System.out.println(st.charAt(i - 1));
    }
}
