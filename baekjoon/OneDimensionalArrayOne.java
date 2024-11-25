import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class OneDimensionalArrayOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] sa = br.readLine().split(" ");
        int v = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            int j = Integer.parseInt(sa[i]);
            if(v == j) {
                count++;
            }
        }
        System.out.print(count);
    }
}
