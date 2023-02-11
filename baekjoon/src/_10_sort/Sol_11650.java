package _10_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 문제
 *      2차원 평면 위의 점 N개가 주어진다.
 *      좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
 *
 * 입력
 *      첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다.
 *      둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다. (-100,000 ≤ xi, yi ≤ 100,000)
 *      좌표는 항상 정수이고, 위치가 같은 두 점은 없다.
 *
 * 출력
 *      첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.
 */
class Sol_11650 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        List<Point> points = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            String[] pointInfo = br.readLine().split(" ");
            points.add(new Point(Integer.parseInt(pointInfo[0]), Integer.parseInt(pointInfo[1])));
        }

        StringBuilder sb = new StringBuilder();

        points.stream()
            .sorted()
            .forEach(p -> {
                sb.append(p.toString());
                sb.append("\n");
            });

        System.out.println(sb);
    }

    private static class Point implements Comparable<Point> {

        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public String toString() {
            return x + " " + y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.x - o.x == 0) {
                return this.y - o.y;
            } else {
                return this.x - o.x;
            }
        }
    }
}
