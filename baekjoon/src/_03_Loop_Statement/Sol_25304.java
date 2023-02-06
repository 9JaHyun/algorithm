package _03_Loop_Statement;

import java.util.Scanner;

/**
 * 준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다.
 * 정말 멋졌다. 그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다!
 * 준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.
 *
 * 영수증에는 다음과 같이 적혀있다,
 *
 *      구매한 물건들의 총 금액
 *
 *      물건의 종류 수
 *
 *      구매한 각 물건의 가격  개수
 *
 * 이를 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.
 */
class Sol_25304 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int totalPrice = sc.nextInt();
        int kindOfThings = sc.nextInt();

        int temp = 0;
        for (int i = 0; i < kindOfThings; i++) {
            int price = sc.nextInt();
            int count = sc.nextInt();
            temp += price * count;
        }

        System.out.println(totalPrice == temp ? "Yes" : "No");
    }
}
