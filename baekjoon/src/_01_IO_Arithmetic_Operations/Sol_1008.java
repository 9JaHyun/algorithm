package _01_IO_Arithmetic_Operations;

import java.util.Scanner;

/**
 *  A / B 를 출력하는 프로그램을 작성
 */
class Sol_1008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int left = sc.nextInt();
        int right = sc.nextInt();

        System.out.println((double) left / right);
    }
}
