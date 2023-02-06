package _06_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 * <p>
 * 입력 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 * <p>
 * 출력 입력으로 주어진 숫자 N개의 합을 출력한다.
 */
class Sol_10809 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        char[] spelling = word.toCharArray();

        int[] wordList = {-1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1,
            -1
        };

        int index = 1;
        for (int i = 0; i < word.length(); i++) {
            if (wordList[spelling[i] - 97] == -1) {
                wordList[spelling[i] - 97] += index;
            }
            index++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < wordList.length; i++) {
            sb.append(wordList[i]);
            if (i != wordList.length -1) {
                sb.append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}
