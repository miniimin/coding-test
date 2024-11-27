import java.io.*;

public class StringArrayEight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        int count = 0;
        boolean inWord = false;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                inWord = false;
            } else if (!inWord) {
                inWord = true;
                count++;
            }
        }
        System.out.println(count);
    }
}