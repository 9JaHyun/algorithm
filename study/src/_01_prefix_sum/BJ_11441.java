package _01_prefix_sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * N개의 수 A1, A2, ..., AN이 입력으로 주어진다. 총 M개의 구간 i, j가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.
 * <p>
 * 링크 : https://www.acmicpc.net/problem/11441
 */
class BJ_11441 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = settingNumbers(br);

        final int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String[] sumRange = br.readLine().split(" ");

            int right = numbers[Integer.parseInt(sumRange[1])];
            int left = numbers[Integer.parseInt(sumRange[0]) - 1];

            System.out.println(right - left);
        }
    }

    private static int[] settingNumbers(BufferedReader br) throws IOException {
        final int n = Integer.parseInt(br.readLine());
        final int[] nums = new int[n + 1];

        final String elements = br.readLine();
        final StringTokenizer st = new StringTokenizer(elements, " ");

        for (int i = 1; i <= n; i++) {
            nums[i] = nums[i - 1] + Integer.parseInt(st.nextToken());
        }

        return nums;
    }
}
