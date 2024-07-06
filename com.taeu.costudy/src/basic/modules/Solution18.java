package basic.modules;

public class Solution18 {
	/*
	 * 양의 정수 n이 매개변수로 주어질 때,
	 * 
	 * n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고
	 * 
	 * n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을
	 * 
	 * return 하는 solution 함수를 작성해 주세요.
	 * 
	 * 제한사항 1 ≤ n ≤ 100
	 * 
	 **/

	public int solution(int n) {
		int answer = 0;
		if (n > 0 && 0 < 101) {
//			if (n % 2 == 0) {
//				for (int i = 2; i <= n; i++) {
			// 이미 위에서 짝수를 검증했기 때문에
			// 아래에서 짝수를 검증할 이유는 없다.
//					answer += (i % 2 == 0) ? (i * i) : 0;
//				}
//			} else {
//				answer = 1;
//				for (int i = 2; i <= n; i++) {
			// 이미 위에서 홀수 검증을 하고 왔기에 아래 코드 또한 중복 검증을 할 필요가 없다.
//					answer += (i % 2 != 0) ? i : 0;
//				}
//			}
			// 프로그래머스 정답
			// for문안의 코드가 홀수, 짝수를 구분짓는 코드
			// 결론 : 수학적 지식을 공부하자
			for (int i = n; i >= 0; i -= 2)
				answer += (n % 2 == 0) ? i * i : i;
		}
		return answer;
	}

}
