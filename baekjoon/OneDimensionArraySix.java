import java.io.*;
public class OneDimensionArraySix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int n = Integer.parseInt(st[0]);
        int m = Integer.parseInt(st[1]);

        int[] arr = new int[n];
        for (int k = 0; k < n; k++) {
            arr[k] = k + 1;
        }
        for (int k = 0; k < m; k++) {
            String[] num = br.readLine().split(" ");
            int i = Integer.parseInt(num[0]) - 1;
            int j = Integer.parseInt(num[1]) - 1;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for(int k : arr)
            sb.append(k).append(" ");
        System.out.println(sb);
    }
}
