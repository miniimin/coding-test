import java.io.*;

public class StringArrayThree {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int i = Integer.parseInt(br.readLine());
        while (i-- > 0){
            String st = br.readLine();
            sb.append(st.charAt(0)).append(st.charAt(st.length()-1)).append("\n");
        }
        System.out.print(sb);
    }
}
