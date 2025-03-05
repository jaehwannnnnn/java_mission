package mission;

import java.util.Scanner;

public class Mission4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int N = sc.nextInt();
        if (N % 2 == 1) {
            System.out.println("홀수 입니다.");
        } else {
            System.out.println("짝수 입니다.");
        }
    }
}
