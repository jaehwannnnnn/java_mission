package mission;

import java.util.Scanner;

public class Mission2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 두개를 입력해주세요.");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("합계 : " + (num1+num2));
    }
}
