package basic.modules.day05;

public class Solution24 {

    /*
     * 정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1 을 크면 0 을
     * return하도록 solution 함수를 완성해주세요.
     */
    // 제한사항
    // 2 ≤ num_list의 길이 ≤ 10
    // 1 ≤ num_list의 원소 ≤ 9
    public int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;
        boolean is = true;
        if (num_list.length < 2 || num_list.length > 10) {
            is = false;
        }

        for (int n : num_list) {
            if (n < 1 || n > 9) {
                is = false;
            }
        }

        if (is) {
            for (int n : num_list) {
                sum +=n;
                mul *=n;
            }
        }
        return mul < (int)Math.pow(sum, 2) ? 1 : 0;
        
        // 프로그래머스 정답 참고
        // reduce(초기값, (누적, 요소) -> 수행문)  형태
        // return (Arrays.stream(num_list).reduce((acc, i) -> acc * i).getAsInt() < Math.pow(Arrays.stream(num_list).sum(), 2)) ? 1 : 0;
    }

}
