package generalmath;

import java.io.*;

public class Five {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int layer = 1;
        int range = 1;

        while (n > range) {
            range = range + layer * 6;
            layer++;
        }
        System.out.println(layer);
    }
}
