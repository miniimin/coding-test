package geometry;

import java.io.*;
import java.util.*;
public class Five {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int minX;
        int maxX;
        int minY;
        int maxY;

        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (i == 0) {
                minX = x;
                maxX = x;
                minY = y;
                maxY = y;
                continue;
            }

            if (x <= minX) {

            }else (x >= maxX) {

            }


        }

        System.out.print((maxX - minX) * (maxY - minY));
    }
}