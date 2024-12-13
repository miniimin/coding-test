package sorting;

import java.io.*;
import java.util.*;

public class Ten {

    static class Member {
        int age;
        String name;

        Member(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return age + " " + name;
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        ArrayList<Member> members = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            members.add(new Member(Integer.parseInt(input[0]), input[1]));
        }

        members.sort(Comparator.comparingInt(a -> a.age));

        for (Member member : members) {
            sb.append(member).append("\n");
            //member 객체를 StringBuilder에 추가하려고 하면,
            // 자바는 해당 객체의 toString() 메서드를 호출하여 문자열로 변환한 후 추가
            //따라서, sb.append(member)와 sb.append(member.toString())은 동일하게 동작
        }

        System.out.println(sb);
    }
}