package advanced;

import java.io.*;

public class Seven {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = 0;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int[] arr = new int[26];
            String st = br.readLine();
            int j = 0;

            if (st.length() < 3) {
                r++;
                continue;
            }

            arr[st.charAt(j) - 'a'] = 1;

            for (j = 1; j < st.length(); j++) {
                int m = st.charAt(j) - 'a';
                if (arr[m] == 0) {
                    arr[m] = 1;
                } else {
                    if ((st.charAt(j - 1) - 'a') != m) {
                        break;
                    }
                }
                if (j == st.length() - 1) r++;
            }
        }
        System.out.println(r);
    }
}