package _03_Loop_Statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 *  입력
 *      첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 *      각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 *  출력
 *      각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
 */
class Sol_11022 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 1; i <= testCase; i++) {
            String str = br.readLine();
            String[] numbers = str.split(" ");
            sb.append("Case #").append(i).append(": ");

            final int left = Integer.parseInt(numbers[0]);
            final int right = Integer.parseInt(numbers[1]);

            sb.append(left).append(" + ").append(right).append(" = ");
            sb.append(left + right);

            if (i != testCase) {
                sb.append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
