package p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * <img class="marble" src="./knapsack_1.png", alt="" />
 */
class Solution {

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int statueAmount = Integer.parseInt(br.readLine());
        final String statueLayout = br.readLine();

        final StringTokenizer st = new StringTokenizer(statueLayout);


        int[] statueLayoutArr = new int[statueAmount];

        // Array 채우기
        for (int i = 0; i < statueAmount; i++) {
            if (Integer.parseInt(st.nextToken()) == 2) {
                statueLayoutArr[i] = 1;
            } else {
                statueLayoutArr[i] = -1;
            }
        }

        int current = 0;
        int max = 0;

        for (int direction : statueLayoutArr) {
            current = Math.max(current, current + direction);
            max = Math.max(max, current);
        }

        System.out.println(max);
    }
}
