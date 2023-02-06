package _05_function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 문제 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
 * <p>
 * 작성해야 하는 함수는 다음과 같다.
 * <p>
 * Java: long sum(int[] a);
 * (클래스 이름: Test) a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열
 * (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000) 리턴값: a에 포함되어 있는 정수 n개의 합
 */
public class Sol_15596 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nums = br.readLine().split(" ");

        int[] numbers = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            numbers[i] = Integer.parseInt(nums[i]);
        }


    }

    public long sum(int[] a) {
        long result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }

        return result;
    }
}
