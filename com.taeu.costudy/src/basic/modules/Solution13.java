package basic.modules;

public class Solution13 {
	/*
	 * 문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해
	 * 주세요.
	 * 
	 * 1 ≤ my_string의 길이 ≤ 100 my_string은 영소문자로만 이루어져 있습니다. 1 ≤ k ≤ 100
	 * 
	 **/

	public String solution(String myString, int k) {
		String answer = "";
		if (myString.length() > 0 && myString.length() < 101 && myString.matches("^[a-z]*$") && k > 0 && k < 101) {
			/*for (int i = 0; i < k; i++) {
				answer += myString;
			}*/
			
			//프로그래머스 다른사람 코드
			answer = myString.repeat(k);
		}
		return answer;
	}

}
