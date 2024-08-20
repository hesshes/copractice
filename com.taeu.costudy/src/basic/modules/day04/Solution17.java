package basic.modules.day04;

public class Solution17 {
	/*
	 * 정수 number와 n, m이 주어집니다.
	 * 
	 * number가 n의 배수이면서 m의 배수이면 1을
	 * 
	 * 아니라면 0을 return하도록 solution 함수를 완성해주세요.
	 * 
	 * 제한사항
	 * 
	 * 10 ≤ number ≤ 100
	 * 
	 * 2 ≤ n, m < 10
	 * 
	 **/

	public int solution(int num, int n, int m) {
		int answer = 0;

		if (num > 1 && num < 101 && n > 1 && n < 10 && m > 1 && m < 101) {
			answer = ((num % n == 0) && (num % m == 0)) ? 1 : 0;
		}

		return answer;
	}

}
