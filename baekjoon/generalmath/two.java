package generalmath;

import java.io.*;

public class two {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(input.split(" ")[0]);
        int b = Integer.parseInt(input.split(" ")[1]);

        String result = convertToBase(n, b);

        System.out.println(result);
    }


    public static String convertToBase(int n, int b) {
        StringBuilder sb = new StringBuilder();
        String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        while (n > 0) {
            int remainder = n % b;
            sb.append(digits.charAt(remainder));
            n /= b;
        }
        return sb.reverse().toString();
    }
}
