import java.io.*;

public class OneDimensionArrayTen {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] st = br.readLine().split(" ");
        int[] arr = new int[n];
        int max = 0;
        float total = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st[i]);
            if (max < arr[i]) max = arr[i];
        }
        for(int i = 0; i < n; i++) {
            total = total + arr[i];
        }
        System.out.println(total/max*100/n);
    }
}