package stackqueuedeque;

import java.io.*;
import java.util.*;

public class Two {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        int k = Integer.parseInt(br.readLine());

        while(k-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                stack.pop();
            } else {
                stack.push(n);
            }
        }
        while(!stack.empty()) {
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}