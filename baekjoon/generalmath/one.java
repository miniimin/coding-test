package generalmath;

import java.io.*;

public class one {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int b = Integer.parseInt(input.split(" ")[1]);
        String n = input.split(" ")[0];

        int sum = 0;

        for(int i = 0; i < n.length(); i++) {
            sum += charToInt(n.charAt(n.length() - i - 1)) * (int)Math.pow(b, i);
        }
        System.out.println(sum);
    }

    static int charToInt(char c) {
        int num;
        if (c >= 'A' && c <= 'Z'){
            num = c - 'A' + 10;
        } else {
            num = c - '0';
        }
        return num;
    }
}
