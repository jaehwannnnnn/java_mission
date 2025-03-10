package mission.basic;

import java.util.Scanner;

public class Mission1 {
    public static void main(String[] args) {
        System.out.println("이름을 입력하세요.");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("나이를 입력하세요. ");
        int age = sc.nextInt();
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}
