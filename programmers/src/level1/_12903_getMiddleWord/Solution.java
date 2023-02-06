package level1._12903_getMiddleWord;

/**
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다. 재한사항 s는 길이가 1 이상,
 * 100이하인 스트링입니다.
 *
 * @Link https://school.programmers.co.kr/learn/courses/30/lessons/12903?language=java
 */
class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("abcde"));
        System.out.println(solution.solution("qwer"));
    }

    // 프로그래밍의 나누기는 딱 몫만 가져옴을 기억하자.
    String solution(String s) {
        return s.substring((s.length() - 1) / 2, (s.length() / 2) + 1);
    }
}
