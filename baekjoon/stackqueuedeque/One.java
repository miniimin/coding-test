package stackqueuedeque;

import java.io.*;
import java.util.*;

public class One {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            switch (i) {
                case 1 :
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    if(stack.empty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.pop()).append("\n");
                    }
                    break;
                case 3:
                    sb.append(stack.size()).append("\n");
                    break;
                case 4:
                    if(stack.empty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case 5:
                    if(stack.empty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.get(stack.size() - 1)).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}