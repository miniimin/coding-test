package advanced;

import java.io.*;

public class Eight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double sumGrade = 0;
        double sumScore = 0;

        for (int i = 0; i < 20; i++) {
            String input = br.readLine();
            if (input.split(" ")[2].equals("P")) continue;
            double grade = Double.parseDouble(input.split(" ")[1]);
            double score = score(input.split(" ")[2]);
            sumGrade = sumGrade + grade;
            sumScore = sumScore + score * grade;
        }
        System.out.println(sumScore/sumGrade);
    }

    static double score(String degree) {
        double result = 0;
        switch (degree) {
            case "A+":
                result = 4.5;
                break;
            case "A0":
                result = 4.0;
                break;
            case "B+":
                result = 3.5;
                break;
            case "B0":
                result = 3.0;
                break;
            case "C+":
                result = 2.5;
                break;
            case "C0":
                result = 2.0;
                break;
            case "D+":
                result = 1.5;
                break;
            case "D0":
                result = 1.0;
                break;
            case "F":
                result = 0.0;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }
}
