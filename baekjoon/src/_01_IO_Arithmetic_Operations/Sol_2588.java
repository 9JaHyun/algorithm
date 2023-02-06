package _01_IO_Arithmetic_Operations;

import java.util.Scanner;

/**
 * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 * <br>
 * <img class="marble" src="./p2588.png", alt="" />
 * <br>
 * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 *
 * link : https://www.acmicpc.net/problem/2588
 */
class Sol_2588 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(num1 * (num2 % 10));
        System.out.println(num1 * ((num2 % 100) - (num2 % 10)) / 10);
        System.out.println(num1 * (num2 - (num2 % 100)) / 100);
        System.out.println(num1 * num2);
    }
}
