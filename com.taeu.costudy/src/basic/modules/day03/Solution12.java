package basic.modules.day03;

import java.util.Scanner;

public class Solution12 {
	/*
	 * 문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해
	 * 주세요.
	 * 
	 * 1 ≤ arr의 길이 ≤ 200 arr의 원소는 전부 알파벳 소문자로 이루어진 길이가 1인 문자열입니다.
	 * 
	 **/

	public String solution(String[] arr) {
		String answer = "";

		boolean isVal = true;

		for (String s : arr) {
			if (isVal) {
				isVal = arrVal(s);
				System.out.println("검증 문자 " + s + " 검증 결과 : " + isVal);
			}
		}

		if (isVal) {

			for (String s : arr) {
				answer += s;
			}
			// 프로그래머스 정답을 이용한 경우
			// answer = String.join("", arr);
		}
		// 프로래머스 정답
		// return String.join("",arr);
		// .join 함수에 대해서 배우고 가지만, 문제의 제약 조건에 대한 처리가 하나 없기 때문에
		// 직접 처리한 결과로 만족하겠음.
		return answer;

	}

	private boolean arrVal(String str) {
		return (str.length() > 0 && str.length() < 101 && str.matches("^[a-z]")) ? true : false;
	}

}
