package basic.modules;

public class Solution25 {

    /*
     * 정수가 담긴 리스트 num_list가 주어집니다. num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을
     * return하도록 solution 함수를 완성해주세요.
     */
    // 제한사항
    // 2 ≤ num_list의 길이 ≤ 10
    // 1 ≤ num_list의 원소 ≤ 9
    // num_list에는 적어도 한 개씩의 짝수와 홀수가 있습니다.
    public int solution(int[] num_list) {
        String evenSum = "";
        String oddSum = "";
        boolean is = true;
        boolean even = false;
        boolean odd = false;

        if (num_list.length < 2 || num_list.length > 10) {
            is = false;
        }

        for (int n : num_list) {
            if (n < 1 || n > 9) {
                is = false;
            }
            if (n % 2 == 0) {
                evenSum += n;
                even = true;
            } else {
                oddSum += n;
                odd = true;
            }
        }

        if (is && even && odd) {
            return Integer.parseInt(evenSum) + Integer.parseInt(oddSum);
        }
        return 0;

        /* 프로그래머스 자리수 늘리기 위한 10 곱하는 경우 코드
         * for(int num : num_list) { if(num % 2 == 0) { even *= 10; even += num; } else
         * { odd *= 10; odd += num; } }
         */

        // 프로그래머스 한줄 코드
        // return Integer.parseInt(Arrays.stream(numList).filter(value -> value % 2 !=
        // 0).mapToObj(String::valueOf).collect(Collectors.joining())) +
        // Integer.parseInt(Arrays.stream(numList).filter(value -> value % 2 ==
        // 0).mapToObj(String::valueOf).collect(Collectors.joining()));
    }

}
