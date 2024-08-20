package basic.modules.day03;

public class Solution15 {
	/*
	 * 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
	 * 
	 * 12 ⊕ 3 = 123
	 * 
	 * 3 ⊕ 12 = 312
	 * 
	 * 
	 * 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
	 * 
	 * 단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
	 * 
	 * 제한사항 1 ≤ a, b < 10,000
	 **/

	public int solution(int a, int b) {

		if (a > 0 && b < 10001) {
			// return Math.max(Integer.parseInt(a + "" + b), (2 * a * b));
			// 프로그래머스 코드
			// valueOf 함수는 정수형 인자를 문자열로 리턴해줌
			// Math.max 함수는 둘중에 큰 수를 반환해줌
			return Math.max(Integer.parseInt(String.valueOf(a) + String.valueOf(b)), 2 * a * b);
		}
		return 0;
	}

}
