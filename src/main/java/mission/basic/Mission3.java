package mission.basic;

import java.util.Scanner;

public class Mission3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두개의 숫자를 입력하세요.");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("더 큰 숫자 : " + Math.max(num1, num2));
    }
}
