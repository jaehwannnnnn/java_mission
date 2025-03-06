package mission;

import java.util.Scanner;

public class Mission9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 크기를 입력하세요.");
        int size = sc.nextInt();
        int[] iarr = new int[size];
        for (int i = 0; i < iarr.length; i++) {
            iarr[i] = sc.nextInt();
            System.out.println(iarr[i]);
        }
        System.out.println("변경 전 : " + iarr[0]);
        double avg = avgArr(iarr);
        System.out.println("배열의 평균 : "+avg);
        changeArr(iarr, 0, 99);
        System.out.println("변경 후 : " + iarr[0]);
    }
    public static double avgArr(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        return avg;
    }

    public static void changeArr(int[] arr, int idx, int num) {
        arr[idx] = num;
    }
}
