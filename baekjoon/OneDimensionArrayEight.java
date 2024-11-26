import java.io.*;

public class OneDimensionArrayEight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 42;
        int m = 10;
        int c = 0;

        int[] arr = new int[n];
        for(int i = 0; i < m; i++) {
           int k = Integer.parseInt(br.readLine()) % n;
           arr[k] = 1;
        }
        for(int i : arr) {
            if (i == 1) c++;
        }
        System.out.println(c);
    }
}
