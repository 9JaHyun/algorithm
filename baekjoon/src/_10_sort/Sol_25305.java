package _10_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제
 *      2022 연세대학교 미래캠퍼스 슬기로운 코딩생활에 N명의 학생들이 응시했다.
 *      이들 중 점수가 가장 높은 k명은 상을 받을 것이다.
 *      이 때, 상을 받는 커트라인이 몇 점인지 구하라.
 *      커트라인이란 상을 받는 사람들 중 점수가 가장 가장 낮은 사람의 점수를 말한다.
 *
 * 입력
 *      첫째 줄에는 응시자의 수 N과 상을 받는 사람의 수 k가 공백을 사이에 두고 주어진다.
 *      둘째 줄에는 각 학생의 점수 x가 공백을 사이에 두고 주어진다.
 *
 * 출력
 *      상을 받는 커트라인을 출력하라.
 */
class Sol_25305 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] info = br.readLine().split(" ");
        int totalCount = Integer.parseInt(info[0]);
        int awardCount = Integer.parseInt(info[1]);
        int[] scores = new int[totalCount];

        String[] scoreString = br.readLine().split(" ");
        for (int i = 0; i < totalCount; i++) {
            scores[i] = Integer.parseInt(scoreString[i]);
        }

        for (int i = 0; i < totalCount - 1; i++) {
            int temp = 0;
            for (int j = i + 1; j < totalCount; j++) {
                if (scores[i] > scores[j]) {
                    temp = scores[j];
                    scores[j] = scores[i];
                    scores[i] = temp;
                }
            }
        }

        System.out.println(scores[awardCount - 1]);
    }
}
