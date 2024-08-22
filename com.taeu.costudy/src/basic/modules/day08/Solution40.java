package basic.modules.day08;

public class Solution40 {

    /*
     * 문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다.
     * 
     * queries의 원소는 [s, e] 형태로, my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다.
     * 
     * my_string에 queries의 명령을 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.
     * 
     */

    // 제한사항
//    my_string은 영소문자로만 이루어져 있습니다.
//    1 ≤ my_string의 길이 ≤ 1,000
//    queries의 원소는 [s, e]의 형태로 0 ≤ s ≤ e < my_string의 길이를 만족합니다.
//    1 ≤ queries의 길이 ≤ 1,000

    public String solution(String my_string, int[][] queries) {
        char[] chars = my_string.toCharArray();
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][1]; j >= queries[i][0]; j--) {
                char[] temp = chars;
            }
        }

        return my_string;
    }
}
