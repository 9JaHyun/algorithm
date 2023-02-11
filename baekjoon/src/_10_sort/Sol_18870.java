package _10_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * 문제
 *      수직선 위에 N개의 좌표 X1, X2, ..., XN이 있다. 이 좌표에 좌표 압축을 적용하려고 한다.
 *      Xi를 좌표 압축한 결과 X'i의 값은 Xi > Xj를 만족하는 서로 다른 좌표의 개수와 같아야 한다.
 *      X1, X2, ..., XN에 좌표 압축을 적용한 결과 X'1, X'2, ..., X'N를 출력해보자.
 *
 * 입력
 *      첫째 줄에 N이 주어진다.
 *      둘째 줄에는 공백 한 칸으로 구분된 X1, X2, ..., XN이 주어진다.
 *
 * 출력
 *      첫째 줄에 X'1, X'2, ..., X'N을 공백 한 칸으로 구분해서 출력한다.
 *
 * 제한
 *      1 ≤ N ≤ 1,000,000
 *      -109 ≤ Xi ≤ 109
 */
class Sol_18870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] origin = new int[N];
        int[] sorted = new int[N];
        HashMap<Integer, Integer> rankingMap = new HashMap<>();	// rank를 매길 HashMap

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            sorted[i] = origin[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted);

        // 정렬 된 배열을 순회하면서 map에 넣어준다.
        int rank = 0;
        for(int num : sorted) {
            /*
             *  이 때 만약 앞선 원소가 이미 순위가 매겨졌다면
             *  중복되면 안되므로, 원소가 중복되지 않을 때만
             *  map에 원소와 그에 대응되는 순위를 넣어준다.
             */
            if(!rankingMap.containsKey(num)) {
                rankingMap.put(num, rank);
                rank++;		// map에 넣고나면 다음 순위를 가리킬 수 있도록 1을 더해준다.
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int key : origin) {
            int ranking = rankingMap.get(key);	// 원본 배열 원소(key)에 대한 value(순위)를 갖고온다.
            sb.append(ranking).append(' ');
        }

        System.out.println(sb);
    }
}
