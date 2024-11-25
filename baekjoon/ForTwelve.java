import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ForTwelve {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true){
            String input = br.readLine();
            if (input == null) {
                break;
            }
            String[] na = input.split(" ");
            int one = Integer.parseInt(na[0]);
            int two = Integer.parseInt(na[1]);
            sb.append(one + two).append("\n");
        }
        System.out.print(sb.toString());
    }
}
