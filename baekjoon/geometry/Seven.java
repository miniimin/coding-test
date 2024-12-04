package geometry;


import java.io.*;

public class Seven {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String st = br.readLine();
            if (st.equals("0 0 0")) break;

            int[] arr = new int[3];
            int max = 0;

            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(st.split(" ")[i]);
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            if (max >= arr[0] + arr[1] + arr[2] - max) {
                sb.append("Invalid").append("\n");
                continue;
            }

            if (arr[0] == arr[1] && arr[1] == arr[2]) {
                sb.append("Equilateral").append("\n");
                continue;
            }

            if (arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) {
                sb.append("Isosceles").append("\n");
                continue;
            }

            sb.append("Scalene").append("\n");
        }
        System.out.print(sb);
    }
}