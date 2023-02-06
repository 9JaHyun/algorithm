package _03_Loop_Statement;

import java.util.Scanner;

/**
 * n이 주어졌을 때 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 */
class Sol_8393 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        System.out.println((n * (1 + n)) / 2);
    }
}
