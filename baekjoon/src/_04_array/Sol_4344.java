package _04_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
 * <p>
 * 입력 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
 * <p>
 * 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고,
 * 100보다 작거나 같은 정수이다.
 * <p>
 * 출력 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
 */
public class Sol_4344 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            String[] scores = br.readLine().split(" ");

            final int studentSize = Integer.parseInt(scores[0]);

            int sum = 0;
            for (int j = 1; j <= studentSize; j++) {
                sum += Integer.parseInt(scores[j]);
            }

            int average = sum / studentSize;

            int goodStudents = 0;
            for (int j = 1; j <= studentSize; j++) {
                int score = Integer.parseInt(scores[j]);
                if (score > average) {
                    goodStudents++;
                }
            }

            double goodPercent = (double) goodStudents / (double) studentSize * 100;

            System.out.printf("%.3f%%\n", goodPercent);
        }
    }
}
