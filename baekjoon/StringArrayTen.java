import java.io.*;

public class StringArrayTen {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int sum = 0;
       for (char c : st.toCharArray()) {
            if (c < 'P') {
                sum += (c - 'A') / 3 + 3;
            }else if (c < 'T') {
                sum += 8;
            }else if (c < 'W') {
                sum += 9;
            }else {
                sum += 10;
            }
        }
        System.out.println(sum);
    }
}