import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneDimensionArraySeven {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = 30;
        int m = 28;

        int[] arr = new int[n];
        for(int i = 0; i < m; i++) {
            arr[Integer.parseInt(br.readLine()) - 1] = 1;
        }
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                sb.append(i + 1).append("\n");
            }
        }
        System.out.println(sb);
    }
}
