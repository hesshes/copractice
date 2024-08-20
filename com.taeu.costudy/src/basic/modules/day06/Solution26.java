package basic.modules.day06;

import java.util.Arrays;

public class Solution26 {

    /*
     * 정수 리스트 num_list가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 마지막 원소가 그전
     * 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.
     */
    // 제한사항
    // 2 ≤ num_list의 길이 ≤ 10
    // 1 ≤ num_list의 원소 ≤ 9
    public int[] solution(int[] num_list) {
        int[] num_list2 = {};
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
            num_list2 = Arrays.copyOf(num_list, num_list.length + 1);
            num_list2[num_list2.length - 1] = num_list[num_list.length - 1] > num_list[num_list.length - 2]
                    ? num_list[num_list.length - 1] - num_list[num_list.length - 2]
                    : num_list[num_list.length - 1] * 2;
        }
        return num_list2;

        /* 기본타입 스트림 사용한 경우 프로그래머스 코드
         * return IntStream.iterate(0, i -> i + 1) .limit(num_list.length + 1) .map(i ->
         * i == num_list.length ? (num_list[i - 1] > num_list[i - 2] ? num_list[i - 1] -
         * num_list[i - 2] : 2 * num_list[i - 1]) : num_list[i]) .toArray();
         * 
         */
    }

}
