package level1._12901_2016Year;

/**
 * @Question 2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요?
 * 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
 * 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT
 * 입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.
 *
 * 제한 조건
 * 2016년은 윤년입니다.
 * 2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
 *
 * @Link https://school.programmers.co.kr/learn/courses/30/lessons/12901
 */
class Solution {

    private static final String[] dayOfWeek = {"THU","FRI","SAT","SUN","MON","TUE","WED"};

    private  String solution(int a, int b) {
        return calcDayOfWeek(calcDays(a) + b);
    }


    private int getLastDateOfMonth(int month) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 29;
            default -> throw new IllegalArgumentException("잘못된 월 입력입니다.");
        };
    }

    private int calcDays(int month) {
        int result = 0;
        for (int i = 1; i < month; i++) {
            result += getLastDateOfMonth(i);
        }
        return result;
    }

    // 2016.01.01은 금요일 -> 어짜피 7로 다 나누어떨어짐.
    // 그러면 나머지로 구분할 수 있지 않을까?
    private String calcDayOfWeek(int days) {
        return dayOfWeek[(days % 7)];
    }
}
