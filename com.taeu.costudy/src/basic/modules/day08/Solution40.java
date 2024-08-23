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

    public String solution(String str, int[][] q) {
        String temp = "";
        char[] answer;
        char[] switcher;
        for (int i = 0; i < q.length; i++) {
            temp = "";
            answer = str.toCharArray();
            for (int j = q[i][1]; j >= q[i][0]; j--) {
                temp += str.charAt(j);
            }
            switcher = temp.toCharArray();
            System.arraycopy(switcher, 0, answer, q[i][0], temp.length());
            str = String.valueOf(answer);
        }
        return str;

    }
    /*
     * 프로그래머스 추천 1순위 정답
     * 
     * char[] arr; 전역 변수로 선언해서 사용했음
     * 
     * public String solution(String my_string, int[][] queries) {
     * 
     * arr = my_string.toCharArray();
     * 
     * for (int[] query : queries) { reverse(query[0], query[1]); }
     * 
     * return new String(arr); }
     * 
     *
     * private void reverse(int s, int e) { while (s < e) { char temp = arr[s]; //
     * 별도 함수를 정의해서 사용했음 arr[s++] = arr[e]; arr[e--] = temp; } }
     */
}
