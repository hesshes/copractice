package basic.modules.day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution30 {

    /*
     * 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e,
     * k] 꼴입니다.
     * 
     * 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.
     * 
     * 각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요. 단, 특정 쿼리의 답이 존재하지 않으면 -1을
     * 저장합니다.
     */

    // 제한사항
//    1 ≤ arr의 길이 ≤ 1,000
//    0 ≤ arr의 원소 ≤ 1,000,000
//    1 ≤ queries의 길이 ≤ 1,000
//    0 ≤ s ≤ e < arr의 길이
//    0 ≤ k ≤ 1,000,000

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            List<Integer> nums = new ArrayList<Integer>();
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (queries[i][2] < arr[j]) {
                    nums.add(arr[j]);
                }
            }
            if (nums.size() != 0 && !nums.isEmpty()) {
                answer[i] = Collections.min(nums);
            } else {
                answer[i] = -1;
            }

        }
        return answer;
        /*
         * 프로그래머스에서 가장 많은 추천 코드
         * 
         * int[] answer = new int[queries.length]; Arrays.fill(answer, -1);
         * 
         * for (int idx = 0; idx < queries.length; idx++) { int[] query = queries[idx];
         * int s = query[0], e = query[1], k = query[2];
         * 
         * for (int i = s; i <= e; i++) { if (k < arr[i]) { answer[idx] = answer[idx] ==
         * -1 ? arr[i] : Math.min(answer[idx], arr[i]); } } }
         * 
         * return answer;
         */

        /*
         * 프로그래머스 스트림 코드 return IntStream.range(0, queries.length) .map(q ->
         * IntStream.rangeClosed(queries[q][0], queries[q][1]) .map(i -> arr[i])
         * .filter(i -> i > queries[q][2]) .min().orElse(-1) ).toArray();
         */
    }
}
