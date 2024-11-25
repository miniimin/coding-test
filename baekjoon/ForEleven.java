import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ForEleven {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            String st = br.readLine();
            if(st.equals("0 0")) {
                break;
            }
            String[] sa = st.split(" ");
            int one = Integer.parseInt(sa[0]);
            int two = Integer.parseInt(sa[1]);
            sb.append(one + two).append("\n");
        }
        System.out.print(sb.toString());
    }
}
