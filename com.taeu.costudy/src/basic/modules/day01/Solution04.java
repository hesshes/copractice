package basic.modules.day01;

import java.util.Scanner;

public class Solution04 {

	/*
	 * 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해
	 * 보세요. 1 ≤ str의 길이 ≤ 20 str은 알파벳으로 이루어진 문자열입니다.
	 **/

	public void solution() {

		System.out.println("##### 기초 문제 4번 ####");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();

		String REGEXP = "^[a-zA-Z]*$";
		String sol = "";
		if (!("".equals(a) || a == null || a.length() > 20) && a.matches(REGEXP)) {
			for (char ch : a.toCharArray()) {
				sol += (Character.isUpperCase(ch) ? Character.toLowerCase(ch) : Character.toUpperCase(ch));
			}
			System.out.println(sol);
		}
	}

}
