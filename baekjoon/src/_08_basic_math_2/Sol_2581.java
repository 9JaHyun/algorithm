package _08_basic_math_2;

import java.io.IOException;
import java.util.Scanner;

/**
 * 문제
 *      자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
 *      예를 들어
 *          M=60, N=100인 경우 60이상 100이하의 자연수 중
 *          소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로,
 *          이들 소수의 합은 620이고, 최솟값은 61이 된다.
 *
 * 입력
 *      입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.
 *      M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.
 *
 * 출력
 *      M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다.
 *      단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.
 */
class Sol_2581 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        boolean[] prime = new boolean[N + 1];
        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i < Math.sqrt(N); i++) {

            if (prime[i] == true) {
                continue;
            }

            for (int j = i * i; j < N + 1; j += i) {
                prime[j] = true;
            }
        }

        int sum = 0;
        int min = N;
        for (int i = M; i <= N; i++) {
            if (prime[i] == false) {
                sum += i;
                if (i < min) {
                    min = i;
                }
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
