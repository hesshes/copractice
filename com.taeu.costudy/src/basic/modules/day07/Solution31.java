package basic.modules.day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution31 {

    /*
     * 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e,
     * k] 꼴입니다.
     * 
     * 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 i가 k의 배수이면 arr[i]에 1을 더합니다.
     * 
     * 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
     */

    // 제한사항
//    1 ≤ arr의 길이 ≤ 1,000
//    0 ≤ arr의 원소 ≤ 1,000,000
//    1 ≤ queries의 길이 ≤ 1,000
//    0 ≤ s ≤ e < arr의 길이
//    0 ≤ k ≤ 5

    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (j % queries[i][2] == 0) {
                    arr[j]++;
                }
            }
        }
        return arr;
        
        
        /*
         * 프로그래머스 추천 1순위 풀이
         * 
         * for (int i = 0; i < queries.length; i++) { for (int j = queries[i][0]; j <=
         * queries[i][1]; j++) { if (j % queries[i][2] == 0) arr[j] += 1; } } return
         * arr;
         * 
         */
        
        
    }
}
