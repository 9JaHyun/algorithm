package _10_sort;

import java.io.IOException;
import java.util.Scanner;

/**
 * 문제 N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * <p>
 * 입력 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000,000보다 작거나 같은
 * 정수이다. 수는 중복되지 않는다.
 * <p>
 * 출력 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 */
class Sol_2751 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

//        bubbleSort(size, numbers);
        quickSort(numbers, 0, size - 1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(numbers[i]);

            if (i != size - 1) {
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());
    }

    private static void bubbleSort(int size, int[] numbers) {
        int temp;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i; j < size; j++) {
                if (numbers[i] > numbers[j]) {
                    swap(numbers, i, j);
                }
            }
        }
    }

    private static void swap(int[] numbers, int i, int j) {
        int temp = numbers[j];
        numbers[j] = numbers[i];
        numbers[i] = temp;
    }

    private static void quickSort(int[] numbers, int low, int high) {

        /*
         *  lo가 hi보다 크거나 같다면 정렬 할 원소가
         *  1개 이하이므로 정렬하지 않고 return한다.
         */
        if (low >= high) {
            return;
        }

        /*
         * 피벗을 기준으로 요소들이 왼쪽과 오른쪽으로 약하게 정렬 된 상태로
         * 만들어 준 뒤, 최종적으로 pivot의 위치를 얻는다.
         *
         * 그리고나서 해당 피벗을 기준으로 왼쪽 부분리스트와 오른쪽 부분리스트로 나누어
         * 분할 정복을 해준다.
         *
         * [과정]
         *
         * Partitioning:
         *
         *      left part      a[(right + left)/2]      right part
         * +---------------------------------------------------------+
         * |    element < pivot    |  pivot  |    element >= pivot   |
         * +---------------------------------------------------------+
         *
         *
         *  result After Partitioning:
         *
         *         left part         a[hi]          right part
         * +---------------------------------------------------------+
         * |   element < pivot    |  pivot  |    element >= pivot    |
         * +---------------------------------------------------------+
         *
         *  result : pivot = hi
         *
         *  Recursion:
         *
         * m_pivot_sort(a, lo, pivot)         m_pivot_sort(a, pivot + 1, hi)
         *
         *         left part                           right part
         * +-----------------------+             +-----------------------+
         * |   element <= pivot    |             |    element > pivot    |
         * +-----------------------+             +-----------------------+
         * lo                pivot          pivot + 1                   hi
         *
         */
        int partitionIndex = partition(numbers, low, high);

        quickSort(numbers, low, partitionIndex);
        quickSort(numbers, partitionIndex + 1, high);
    }

    /**
     * pivot을 기준으로 파티션을 나누기 위한 약한 정렬 메소드
     *
     * @param a		정렬 할 배열
     * @param left	현재 배열의 가장 왼쪽 부분
     * @param right	현재 배열의 가장 오른쪽 부분
     * @return		최종적으로 위치한 피벗의 위치(hi)를 반환
     */
    private static int partition(int[] a, int left, int right) {
        int low = left - 1;
        int high = right + 1;
        int pivot = a[(left + right) / 2];

        while (true) {
            do {
                low++;
            } while (a[low] < pivot);

            do {
                high--;
            } while (a[high] > pivot && low <= high);

            if (low >= high) {
                return high;
            }

            swap(a, low, high);
        }
    }
}
