import java.io.*;

public class OneDimensionalArrayFour {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int max = 0;
        int len = 0;
        int i = 0;
        while(i < 9) {
            String input = br.readLine();
            int n = Integer.parseInt(input);
            if(n > max) {
                max = n;
                len = i + 1;
            }
            i++;
        }
        sb.append(max).append('\n').append(len);
        System.out.println(sb);
    }
}
