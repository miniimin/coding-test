package advanced;

import java.io.*;

public class Six {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'c' && i + 1 < input.length() && (input.charAt(i + 1) == '=' || input.charAt(i + 1) == '-')) {
                count++;
                i++;
            }
            else if (c == 'd' && i + 2 < input.length() && input.charAt(i + 1) == 'z' && input.charAt(i + 2) == '=') {
                count++;
                i += 2;
            }
            else if (c == 'd' && i + 1 < input.length() && input.charAt(i + 1) == '-') {
                count++;
                i++;
            }
            else if ((c == 'l' || c == 'n') && i + 1 < input.length() && input.charAt(i + 1) == 'j') {
                count++;
                i++;
            }
            else if ((c == 's' || c == 'z') && i + 1 < input.length() && input.charAt(i + 1) == '=') {
                count++;
                i++;
            }
            else {
                count++;
            }
        }
        System.out.println(count);
    }
}