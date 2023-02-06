package _01_IO_Arithmetic_Operations;

import java.util.Scanner;

/**
 *  사칙연산을 출력하는 프로그램을 작성
 *  A + B
 *  A - B
 *  A * B
 *  A / B
 *  A % B
 *  순으로 출력되어야 함.
 */
class Sol_10869 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int left = sc.nextInt();
        int right = sc.nextInt();

        System.out.println(left + right);
        System.out.println(left - right);
        System.out.println(left * right);
        System.out.println(left / right);
        System.out.println(left % right);
    }
}
