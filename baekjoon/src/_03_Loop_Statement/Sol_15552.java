package _03_Loop_Statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다.
 * 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.
 *
 * Java를 사용하고 있다면, Scanner와 System.out.println 대신
 * BufferedReader와 BufferedWriter를 사용할 수 있다. BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
 *
 *  입력
 *      첫 줄에 테스트케이스의 개수 T가 주어진다.   T는 최대 1,000,000이다.
 *      다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
 *
 *  출력
 *      각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
 */
class Sol_15552 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 1; i <= testCase; i++) {
            String str = br.readLine();
            String[] numbers = str.split(" ");
            sb.append(Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]));

            if (i != testCase) {
                sb.append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
