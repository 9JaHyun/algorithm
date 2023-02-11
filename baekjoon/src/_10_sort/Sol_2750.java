package _10_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제
 *      N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 *
 * 입력
 *      첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다.
 *      둘째 줄부터 N개의 줄에는 수가 주어진다.
 *      이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 *
 * 출력
 *      첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 */
class Sol_2750 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < count - 1; i++) {
            int temp = 0;
            for (int j = i + 1; j < count; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(numbers[i]);

            if (i != count - 1) {
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }
}
