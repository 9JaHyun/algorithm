package _02_Conditional_Statement;

import java.util.Scanner;

/**
 * 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
 *
 * 첫째 줄에 다음 세 가지 중 하나를 출력한다.
 *  - A가 B보다 큰 경우에는 '>'를 출력한다.
 *  - A가 B보다 작은 경우에는 '<'를 출력한다.
 *  - A와 B가 같은 경우에는 '=='를 출력한다.
 */
class Sol_1330 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int left = sc.nextInt();
        int right = sc.nextInt();

        String result;

        if (left > right) {
            result = ">";
        } else if (left == right) {
            result = "==";
        } else {
            result = "<";
        }

        System.out.println(result);
    }
}
