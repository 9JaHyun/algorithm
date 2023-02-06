package _03_Loop_Statement;

import java.util.Scanner;

/**
 *
 * 입력
 *      입력은 여러 개의 테스트 케이스로 이루어져 있다.
 *      각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *      입력의 마지막에는 0 두 개가 들어온다.
 *
 * 출력
 *      각 테스트 케이스마다 A+B를 출력한다.
 */
class Sol_10952 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            int left = sc.nextInt();
            int right = sc.nextInt();

            if (left == 0 && right == 0) {
                break;
            }
            sb.append(left + right).append("\n");
        }

        System.out.println(sb);

    }
}
