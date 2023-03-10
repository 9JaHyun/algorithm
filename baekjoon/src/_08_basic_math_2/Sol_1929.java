package _08_basic_math_2;

import java.io.IOException;
import java.util.Scanner;

/**
 * 문제
 *      M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
 *
 * 입력
 *      첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000)
 *      M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
 *
 * 출력
 *      한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
 */
class Sol_1929 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        boolean[] prime = new boolean[N + 1];
        prime[0] = true;
        prime[1] = true;

        for (int i = 0; i <= Math.sqrt(N + 1); i++) {
            if (prime[i] == true) {
                continue;
            }

            for (int j = i * i; j < N + 1; j += i) {
                prime[j] = true;
            }
        }

        for (int i = M; i <= N; i++) {
            if (!prime[i]) {
                System.out.println(i);
            }
        }
    }
}
