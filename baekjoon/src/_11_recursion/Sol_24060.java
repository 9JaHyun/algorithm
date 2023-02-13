package _11_recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제 오늘도 서준이는 병합 정렬 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자. N개의 서로 다른 양의 정수가 저장된 배열
 * A가 있다. 병합 정렬로 배열 A를 오름차순 정렬할 경우 배열 A에 K 번째 저장되는 수를 구해서 우리 서준이를 도와주자.
 * <p>
 * 크기가 N인 배열에 대한 병합 정렬 의사 코드는 다음과 같다.
 * <p>
 * merge_sort(A[p..r]) { # A[p..r]을 오름차순 정렬한다. if (p < r) then { q <- ⌊(p + r) / 2⌋;       # q는 p,
 * r의 중간 지점 merge_sort(A, p, q);      # 전반부 정렬 merge_sort(A, q + 1, r);  # 후반부 정렬 merge(A, p, q, r);
 * # 병합 } }
 * <p>
 * # A[p..q]와 A[q+1..r]을 병합하여 A[p..r]을 오름차순 정렬된 상태로 만든다. # A[p..q]와 A[q+1..r]은 이미 오름차순으로 정렬되어 있다.
 * merge(A[], p, q, r) { i <- p; j <- q + 1; t <- 1; while (i ≤ q and j ≤ r) { if (A[i] ≤ A[j]) then
 * tmp[t++] <- A[i++]; # tmp[t] <- A[i]; t++; i++; else tmp[t++] <- A[j++]; # tmp[t] <- A[j]; t++;
 * j++; } while (i ≤ q)  # 왼쪽 배열 부분이 남은 경우 tmp[t++] <- A[i++]; while (j ≤ r)  # 오른쪽 배열 부분이 남은 경우
 * tmp[t++] <- A[j++]; i <- p; t <- 1; while (i ≤ r)  # 결과를 A[p..r]에 저장 A[i++] <- tmp[t++]; } 입력 첫째
 * 줄에 배열 A의 크기 N(5 ≤ N ≤ 500,000), 저장 횟수 K(1 ≤ K ≤ 108)가 주어진다. 다음 줄에 서로 다른 배열 A의 원소 A1, A2, ..., AN이
 * 주어진다. (1 ≤ Ai ≤ 109)
 * <p>
 * 출력 배열 A에 K 번째 저장 되는 수를 출력한다. 저장 횟수가 K 보다 작으면 -1을 출력한다.
 */
class Sol_24060 {

    private static int[] temp;
    private static int count = 0;
    private static int K;
    private static int result = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] info = br.readLine().split(" ");
        int size = Integer.parseInt(info[0]);
        K = Integer.parseInt(info[1]);

        temp = new int[size];

        int[] numbers = new int[size];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int index = 0;
        while (st.hasMoreTokens()) {
            numbers[index++] = Integer.parseInt(st.nextToken());
        }

        mergeSort(numbers, 0, numbers.length - 1);
        System.out.print(result);
    }

    private static void mergeSort(int[] numbers, int first, int last) {
        if (first < last) {
            int middleIndex = (first + last) / 2;
            mergeSort(numbers, first, middleIndex);
            mergeSort(numbers, middleIndex + 1, last);
            merge(numbers, first, middleIndex, last);
        }
    }

    private static void merge(int A[], int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int t = 0;

        while (i <= mid && j <= high) {
            if (A[i] <= A[j]) {
                temp[t++] = A[i++];
            } else {
                temp[t++] = A[j++];
            }
        }

        while (i <= mid) {
            temp[t++] = A[i++];
        }

        while (j <= high) {
            temp[t++] = A[j++];
        }

        t = 0;
        i = low;

        while (i <= high) {
            count++;
            if (count == K) {
                result = temp[t];
                break;
            }
            A[i++] = temp[t++];
        }
    }
}
