package basic.modules.day08;

public class Solution36 {

    /*
     * boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때,
     * 
     * 다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.
     * 
     * ∨(OR) ∧(AND)
     * 
     * (x1 ∨ x2) ∧ (x3 ∨ x4)
     */

    // 제한사항
//    1 ≤ arr의 길이 ≤ 100,000
//    1 ≤ arr의 원소 ≤ 100,000

    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4);
    }
}
