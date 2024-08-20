package basic.modules.day02;

public class Solution10 {
    /*
     * 문자열 my_string, overwrite_string과 정수 s가 주어집니다. 문자열 my_string의 인덱스 s부터
     * overwrite_string의 길이만큼을 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를
     * 작성해 주세요.
     * 
     * 제한사항 my_string와 overwrite_string은 숫자와 알파벳으로 이루어져 있습니다. 1 ≤ overwrite_string의
     * 길이 ≤ my_string의 길이 ≤ 1,000 0 ≤ s ≤ my_string의 길이 - overwrite_string의 길이
     * 
     **/

    public String solution(String my_string, String overwirte_string, int s) {
        String answer = my_string.substring(0, s) + overwirte_string
                + my_string.substring(s + overwirte_string.length());
        /*
         * 문제풀이시 문자열 함수 개념 부족 1. replace 함수로 substring의 중간 부분을 치환할 수 있는 함수는 없다. -
         * replace(int start, int end, String replaceStr)이 존재할거라는 착각을 함 2. substring을
         * 이용한 조립시 마지막 잘린 부분을 추가로 더해줘야 한다는 걸 망각
         * 참고 : 자바의 문자열 pool에 관해 조사해보자
         */
        return answer;

    }

}
