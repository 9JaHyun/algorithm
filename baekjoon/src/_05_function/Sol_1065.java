package _05_function;

import java.util.Scanner;

/**
 *  문제
 *      어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
 *      등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
 *      N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
 *
 *  입력
 *      첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
 *
 *  출력
 *      첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
 */
public class Sol_1065 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(isAS(sc.nextInt()));
        sc.close();
    }

    public static int isAS(int num) {
        if (num < 100) {
            return num;
        }

        int result = 99;

        for (int i = 111; i <= num; i++) {
            int hun = i / 100;
            int ten = (i / 10) % 10;
            int one = i % 10;

            if ((hun - ten) == (ten - one)) {
                result++;
            }
        }

        return result;
    }
}
