package _07_basic_math_1;

import java.io.IOException;
import java.util.Scanner;

/**
 * 문제 땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다. 달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터
 * 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.
 * <p>
 * 달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
 * <p>
 * 입력 첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)
 * <p>
 * 출력 첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.
 */
class Sol_2869 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();   // 낮동안 올라갈 수 있는 높이
        int B = sc.nextInt();   // 밤동안 떨어지는 높이
        int V = sc.nextInt();   // 목표 높이

        calcDayV2(A, B, V);

    }

    // 시간 초과
    private static void calcDayV1(int A, int B, int V) {
        int n = 1;
        int currentHeight = 0;
        while (true) {
            if (currentHeight + A >= V) {
                System.out.println(n);
                break;
            }
            currentHeight += (A - B);
            n++;
        }
    }

    // 소수점까지 계산하고 싶다면 double을 주의하자
    private static void calcDayV2(double A, double B, double V) {
        // N * (A-B) >= V => N >= V / (A-B)
        // 핵심 -> B를 빼기 전에 도착하면 그대로 종료!
        // 위의 조건식 : V <= (A + B)N - B => (V - B) / (A + B) <= N
        int n = (int) Math.ceil((V - B) / (A - B));
        System.out.println(n);
    }
}
