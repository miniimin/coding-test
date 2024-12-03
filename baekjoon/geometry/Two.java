package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Two {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int x = Integer.parseInt(input.split(" ")[0]);
        int y = Integer.parseInt(input.split(" ")[1]);
        int w = Integer.parseInt(input.split(" ")[2]);
        int h = Integer.parseInt(input.split(" ")[3]);

        int a = Math.min(w - x, x);
        int b = Math.min(h - y, y);

        System.out.println(Math.min(a, b));
    }
}