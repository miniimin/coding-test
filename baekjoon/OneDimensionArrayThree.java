import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class OneDimensionArrayThree {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] st = br.readLine().split(" ");

        int x = Integer.parseInt(st[0]);
        int min = x;
        int max = x;

        for(int i = 1; i < n; i++) {
            x = Integer.parseInt(st[i]);
            if (x > max) max = x;
            if (x < min) min = x;
        }
        System.out.printf("%d %d", min, max);
    }
}
