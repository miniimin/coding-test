package setandmap;

import java.io.*;
import java.util.*;

public class Seven {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<Integer> a = new HashSet<>();
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(st1.nextToken()));
        }

        Set<Integer> b = new HashSet<>();
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b.add(Integer.parseInt(st2.nextToken()));
        }

        /*
        Set<Integer> c = new HashSet<>();
        c.addAll(a);
        c.addAll(b);
        System.out.println(c.size() * 2 - a.size() - b.size());
         */

        Set<Integer> aMinusB = new HashSet<>(a);
        aMinusB.removeAll(b);
        Set<Integer> bMinusA = new HashSet<>(b);
        bMinusA.removeAll(a);

        aMinusB.addAll(bMinusA);

        System.out.println(aMinusB.size());
    }
}