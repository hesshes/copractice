package basic.modules.day04;

public class Solution20 {
	/*
	 * 두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때,
	 * 
	 * flag가 true면 a + b를 false면 a - b를
	 * 
	 * return 하는 solution 함수를 작성해 주세요.
	 * 
	 * 제한사항
	 * 
	 * -1,000 ≤ a, b ≤ 1,000
	 * 
	 **/

	public int solution(int a, int b, boolean flag) {
		int answer = 0;

		if (a > -1001 && b < 1001) {
			answer = flag ? a + b : a - b;
		}

		return answer;

	}

}
