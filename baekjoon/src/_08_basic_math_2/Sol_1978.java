package _08_basic_math_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제
 *      주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 *
 * 입력
 *      첫 줄에 수의 개수 N이 주어진다. N은 100이하이다.
 *      다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
 *
 * 출력
 *      주어진 수들 중 소수의 개수를 출력한다.
 */
class Sol_1978 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while (st.hasMoreTokens()) {

            int num = Integer.parseInt(st.nextToken());

            if (isPrimeV2(num)) {
                count++;
            }
        }

        System.out.println(count);
    }

    // 1. 용인 제외 나머지가 0이 되는게 있나 없나 순회
    private static boolean isPrimeV1(int num) {

        if (num == 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    // 2. 제곱근 사용.
    // num = A x B 라면... => 1 <= A, B <= num 이 성립
    // A, B > sqrt(num) 이라면, 위의 전제는 오류가 생김. (A X B = num 이므로)
    // 그러므로 A, B 는 절대 sqrt(num)보다 클 수 없음.
    // 이를 이용하면 소수 판별은 sqrt(num) 까지만 해도 충분하다.
    private static boolean isPrimeV2(int num) {

        if (num == 1) {
            return false;
        }

        // 여기서 최적화!!
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    // 3. 에라토스테네스의 체
    // 검사할 수의 배수를 모두 거르면 된다.
    // 보통 1 ~ N 까지의 모든 소수를 구할 때 사
    private static boolean[] isPrimeV3(int num) {

        boolean[] prime = new boolean[num + 1];
        prime[0] = true;
        prime[1] = true;
        prime[num] = true;

        for (int i = 2; i < Math.sqrt(num); i++) {

            if (prime[i] = true) {
                continue;
            }

            // 배수는 모두 거르기
            for (int j = i * i; j < num + 1; j += i) {
                prime[j] = true;
            }
        }

        return prime;
    }

}
