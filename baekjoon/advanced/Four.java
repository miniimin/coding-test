package advanced;

import java.io.*;

public class Four {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int result = 0;
        int i = 0;
        int j = st.length() - 1;
        while (true) {
            if (st.charAt(i) == st.charAt(j)) {
                i++;
                j--;
                if (i == j || i > j) {result = 1; break;}
            }else {
                break;
            }
        }
        System.out.println(result);
    }
}