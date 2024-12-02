package generalmath;

import java.io.*;
import java.util.StringTokenizer;

public class Seven {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int day = (int) Math.ceil((double)(v - b) / (a - b));

        System.out.println(day);
    }
}