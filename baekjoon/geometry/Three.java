package geometry;

import java.io.*;

public class Three {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i < 3; i++) {
            String input = br.readLine();
            x[i] = Integer.parseInt(input.split(" ")[0]);
            y[i] = Integer.parseInt(input.split(" ")[1]);
        }

        if (x[0] == x[1]) {
            System.out.print(x[2] + " ");
        }else if (x[0] == x[2]) {
            System.out.print(x[1] + " ");
        }else {
            System.out.print(x[0] + " ");
        }

        if (y[0] == y[1]) {
            System.out.print(y[2]);
        }else if (y[0] == y[2]) {
            System.out.print(y[1]);
        }else {
            System.out.print(y[0]);
        }
    }
}
