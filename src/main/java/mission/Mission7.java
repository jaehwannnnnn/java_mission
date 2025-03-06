package mission;

import java.util.Scanner;

public class Mission7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("직사각형의 가로, 세로를 입력하시오.");
        int width = sc.nextInt();
        int height = sc.nextInt();
        System.out.println("직사각형의 넓이 : " + (width * height));
    }
}
