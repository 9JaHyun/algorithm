package _03_Loop_Statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  별찍기
 *
 *  입력
 *      첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 *  출력
 *      첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 */
class Sol_2438 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int line = Integer.parseInt(br.readLine());

        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }

            if (i != line) {
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
