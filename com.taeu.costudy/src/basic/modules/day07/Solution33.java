package basic.modules.day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution33 {

    /*
     * 정수 start_num와 end_num가 주어질 때, start_num부터 end_num까지의 숫자를 차례로 담은 리스트를
     * return하도록 solution 함수를 완성해주세요.
     */

    // 제한사항
//    1 ≤ l ≤ r ≤ 1,000,000

    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            char[] nums = String.valueOf(i).toCharArray();
            boolean is = true;
            for (char num : nums) {
                if (Character.getNumericValue(num) != 0 && Character.getNumericValue(num) != 5) {
                    is = false;
                    break;
                }
            }
            if (is)
                list.add(i);
        }

        return list.size() == 0 ? new int[] { -1 } : list.stream().mapToInt(i -> i).toArray();

        /*
         * 프로그래머스 추천 1순위 풀이
         * 
         * i 의 범위가 63까지인 이유 : 2진법으로 변환 했을 때 최대 자리수가 6자리까지 나타내기 위해 i를 2진법으로 바꾼 후 그것을 문자
         * 그대로 일반 int타입 10진수로 변환. ex) 3 -> 000011 -> 11 변환된 값에 5를 곱함 ex) 11 * 5 -> 55
         * 이렇게 변환된 수들 중 주어진 범위 l, r 내에 있으면 add 2진법을 사용하면 0과 어떤수로든 이루어진 숫자만 구할 수 있다.
         * 
         * ArrayList<Integer> list = new ArrayList<>();
         * 
         * for (int i = 1; i < 64; i++) { int num =
         * Integer.parseInt(Integer.toBinaryString(i)) * 5; if (l <= num && num <= r)
         * list.add(num); }
         * 
         * return list.isEmpty() ? new int[] { -1 } : list.stream().mapToInt(i ->
         * i).toArray();
         * 
         */

        /*
         * 스트림 사용한 풀이 List<Integer> filtered = IntStream.rangeClosed(l, r) .filter(num
         * -> String.valueOf(num).chars().allMatch(ch -> ch == '0' || ch == '5'))
         * .boxed() .collect(Collectors.toList()); return filtered.isEmpty() ? new int[]
         * {-1} : filtered.stream().mapToInt(Integer::intValue).toArray();
         */

    }
}