package _04_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 * <p>
 * 입력 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다
 * 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 * <p>
 * 출력 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 */
public class Sol_10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 1; i <= 9; i++) {
            int currentNum = Integer.parseInt(br.readLine());

            if (currentNum > max) {
                max = currentNum;
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}
