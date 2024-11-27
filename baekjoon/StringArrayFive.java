import java.io.*;

public class StringArrayFive {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        /*
        String st = br.readLine();
        for(int i = 0; i < n; i++) {
            sum = sum + Character.getNumericValue(st.charAt(i));
        }*/
        String[] st = br.readLine().split("");
        for (int i = 0; i < n; i++) {
            sum = sum + Integer.parseInt(st[i]);
        }
        System.out.println(sum);
    }
}
