package mission;

import java.util.Arrays;
import java.util.Scanner;

public class Mission6 {
    public static void main(String[] args) {
        System.out.println("정수 5개를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
}
