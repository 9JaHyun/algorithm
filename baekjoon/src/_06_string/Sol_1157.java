package _06_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제
 *      알파벳 대소문자로 된 단어가 주어지면,
 *      이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
 *      단, 대문자와 소문자를 구분하지 않는다.
 *
 * 입력
 *      첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다.
 *      주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 *
 * 출력
 *      첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
 *      단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 */
class Sol_1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        char[] spelling = word.toCharArray();
        int[] alphabet = new int[26];

        for (int i = 0; i < spelling.length; i++) {
            if (spelling[i] >= 97) {
                alphabet[spelling[i] - 97]++;
            } else {
                alphabet[spelling[i] - 65]++;
            }
        }

        int max = -1;
        int ascii = 0;
        boolean duplicate = false;

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > max) {
                ascii = 65 + i;
                max = alphabet[i];
                duplicate = false;
            } else if (alphabet[i] == max) {
                duplicate = true;
            }
        }

        if (duplicate) {
            System.out.println("?");
        } else {
            System.out.println(Character.toChars(ascii));
        }
    }
}