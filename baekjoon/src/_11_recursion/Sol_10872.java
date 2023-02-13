package _11_recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제
 *      0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
 *
 * 입력
 *      첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.
 *
 * 출력
 *      첫째 줄에 N!을 출력한다.
 */
class Sol_10872 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int result = sol1(num);
        System.out.println(result);
    }

    // 반복문
    private static int sol1(int num) {
        if (num == 0) {
            return 1;
        }

        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // 재귀 : N! = N X (N - 1)!
    private static int sol2(int num) {
        if (num <= 0) {
            return 1;
        }

        return num * sol2(num - 1);
    }
}
