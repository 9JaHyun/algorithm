package _08_basic_math_2;

import java.io.IOException;
import java.util.Scanner;

/**
 * 문제
 *      베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
 *      이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.
 *      예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)
 *      자연수 n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오.
 *
 * 입력
 *      입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 케이스는 n을 포함하는 한 줄로 이루어져 있다.
 *      입력의 마지막에는 0이 주어진다.
 *
 * 출력
 *      각 테스트 케이스에 대해서, n보다 크고, 2n보다 작거나 같은 소수의 개수를 출력한다.
 */
class Sol_4948 {

    public static void main(String[] args) throws IOException {

        // setting
        boolean[] prime = new boolean[246913];
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) {
                continue;
            }

            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

        Scanner sc = new Scanner(System.in);

        while(true) {
            int N = sc.nextInt();

            if(N == 0) break;

            int count = 0;

            for (int i = N + 1; i <= 2 * N; i++) {
                if (!prime[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
