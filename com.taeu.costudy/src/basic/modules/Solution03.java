package basic.modules;

import java.util.Scanner;

public class Solution03 {

	/*
	 * 문자열 str과 정수 n이 주어집니다. str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요. 1 ≤ str의 길이 ≤ 10
	 * 1 ≤ n ≤ 5
	 */

	public void solution() {

		Scanner sc = new Scanner(System.in);
		System.out.println("##### 기초 문제 3 #####");
		String str = sc.next();
		int in = sc.nextInt();

		if (!(str.isEmpty() || "".equals(str) || str == null || str.length() > 10) && (in < 5 && in > 0)) {
			System.out.println(str.repeat(in));
		}
	}

}
