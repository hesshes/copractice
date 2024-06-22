package basic.modules;

import java.util.Scanner;

public class Solution11 {
	/*
	 * 길이가 같은 두 문자열 str1과 str2가 주어집니다. 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을
	 * 만들어 return 하는 solution 함수를 완성해 주세요.
	 * 
	 * 1 ≤ str1의 길이 = str2의 길이 ≤ 10 str1과 str2는 알파벳 소문자로 이루어진 문자열입니다.
	 **/

	public String solution(String str1, String str2) {
		String answer = "";
		if (str1.length() > 0 && str1.length() < 11 && str1.matches("^[a-z]*$") && str2.matches("^[a-z]*$")
				&& str1.length() == str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				answer += str1.toCharArray()[i];
				answer += str2.toCharArray()[i];

				// 프로그래머스 다른사람 풀이 참고한 정답
				// answer += str1.charAt(i);
				// answer += str2.charAt(i);
			}

			/*
			 * toCharArray()의 경우 해당 문자열을 배열로 변환 후에 해당 index에 접근해서 값을 가져옴 charAt(i)의 경우 해당
			 * 문자열의 i 번째 index에 접근해서 값을 가져옴 따라서 charAt이 조금 더 효율성이 좋음
			 * 
			 */
		}
		return answer;

	}

}
