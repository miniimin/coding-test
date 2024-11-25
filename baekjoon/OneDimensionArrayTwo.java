import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class OneDimensionArrayTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st1 = br.readLine().split(" ");
        String[] st2 = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st1[0]);
        int x = Integer.parseInt(st1[1]);

        for(int i = 0; i < n; i++) {
            int y = Integer.parseInt(st2[i]);
            if(y < x) sb.append(y).append(" ");
        }
        System.out.print(sb);
    }
}
