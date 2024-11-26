import java.io.*;

public class OneDimensionalArrayFive {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] st1 = br.readLine().split(" ");
        int n = Integer.parseInt(st1[0]);
        int m = Integer.parseInt(st1[1]);
        int[] arr = new int[n];

        for(int a = 0; a < m; a++) {
            String[] st2 = br.readLine().split(" ");
            int i = Integer.parseInt(st2[0]);
            int j = Integer.parseInt(st2[1]);
            int k = Integer.parseInt(st2[2]);
            while(i <= j) {
                arr[i - 1] = k;
                i++;
            }
        }

        for(int b : arr)
            sb.append(b).append(" ");
        System.out.println(sb);
    }
}
