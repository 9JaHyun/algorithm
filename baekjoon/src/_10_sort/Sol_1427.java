package _10_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 문제
 *      배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
 *
 * 입력
 *      첫째 줄에 정렬하려고 하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.
 *
 * 출력
 *      첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
 */
class Sol_1427 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] elements = br.readLine().split("");
        List<Integer> numbers = new ArrayList<>(elements.length);

        for (int i = 0; i < elements.length; i++) {
            numbers.add(Integer.parseInt(elements[i]));
        }

        List<Integer> result = numbers.stream()
            .sorted((o1, o2) -> o2 - o1)
            .collect(Collectors.toList());


        StringBuilder sb = new StringBuilder();

        for (Integer number : result) {
            sb.append(number);
        }

        System.out.println(Integer.parseInt(sb.toString()));
    }
}
